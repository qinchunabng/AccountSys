package com.dbkj.account.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("action", "id", Action.class);
		arp.addMapping("admin", "id", Admin.class);
		arp.addMapping("admin_action", "id", AdminAction.class);
		arp.addMapping("admin_auth", "id", AdminAuth.class);
		arp.addMapping("admin_role", "id", AdminRole.class);
		arp.addMapping("admin_role_auth", "id", AdminRoleAuth.class);
		arp.addMapping("alert", "id", Alert.class);
		arp.addMapping("favorable", "id", Favorable.class);
		arp.addMapping("opera_action", "id", OperaAction.class);
		arp.addMapping("opera_type", "id", OperaType.class);
		arp.addMapping("user", "id", User.class);
		arp.addMapping("user_action", "id", UserAction.class);
		arp.addMapping("user_auth", "id", UserAuth.class);
		arp.addMapping("user_info", "id", UserInfo.class);
		arp.addMapping("user_info_history", "id", UserInfoHistory.class);
		arp.addMapping("user_log", "id", UserLog.class);
		arp.addMapping("user_log_201708", "id", UserLog201708.class);
		arp.addMapping("user_mail", "id", UserMail.class);
		arp.addMapping("user_recharge", "id", UserRecharge.class);
		arp.addMapping("user_role", "id", UserRole.class);
		arp.addMapping("user_role_auth", "id", UserRoleAuth.class);
		arp.addMapping("user_voice", "id", UserVoice.class);
		arp.addMapping("user_voice_audit", "id", UserVoiceAudit.class);
	}
}
