package com.dbkj.account.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dbkj.account.dto.MenuNode;
import com.dbkj.account.model.AdminAuth;
import com.dbkj.account.util.SqlUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class ManageHomeService {
	
	public static final String ADMIN_MENU_CACHE="adminMenuCache";

	/**
	 * 获取菜单信息
	 * @param roleId admin角色id
	 * @return
	 */
	public List<MenuNode> getAdminMenuList(final Long roleId){
		List<MenuNode> menuList=new ArrayList<>();
		MenuNode mn=new MenuNode();
		mn.setId("0");
		mn.setText("我的工作台");
		mn.setIsHeader(true);
		menuList.add(mn);
		
		List<Record> rlist=Db.find(SqlUtil.getSql(AdminAuth.class, "getRoleAuthByRoleId"),roleId);
		
		boolean isFirst=true;
		for(Record r:rlist){
			Long parentId=r.getLong("parent_id");
			if(parentId==null||parentId.longValue()==0){
				MenuNode node=new MenuNode();
				node.setId(r.getLong("id").toString());
				node.setText(r.getStr("auth_name"));
				node.setIcon(r.getStr("icon"));
				node.setOrder(r.getInt("order"));
				if(isFirst){
					node.setIsOpen(true);
					isFirst=false;
				}
				getChildren(r,node,rlist);
				menuList.add(node);
			}
		}
		//按照order的大小排序
		Collections.sort(menuList, new MenuComparator());
		return menuList;
	}
	
	private void getChildren(Record r,MenuNode menu,List<Record> list){
		Long id=r.getLong("id");
		List<MenuNode> children=new ArrayList<>();
		for(Record record:list){
			Long parentId=record.getLong("parent_id");
			if(parentId!=null&&parentId.longValue()==id.longValue()){
				MenuNode menuNode=new MenuNode();
				menuNode.setId(record.getLong("id").toString());
				menuNode.setText(record.getStr("auth_name"));
				menuNode.setIcon(record.getStr("icon"));
				String url=record.getStr("action_url");
				if(null!=url){
					menuNode.setUrl(url);
					menuNode.setTargetType("iframe-tab");
				}
				getChildren(record, menuNode, list);
				children.add(menuNode);
			}
		}
		if(children.size()>0){
			//按照order的大小排序
			Collections.sort(children, new MenuComparator());
			menu.setChildren(children);
		}
		
	}
	
	private class MenuComparator implements Comparator<MenuNode>{

		@Override
		public int compare(MenuNode o1, MenuNode o2) {
			return o1.getOrder()-o2.getOrder();
		}
		
	}
}
