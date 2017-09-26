package com.lqm.home.huanxin;
import java.util.List;
import java.util.Map;
public class TalkNode {
	public static final String[][]DATA_ENTITIES = new String[][]{{"entities","entities_share"},{"share-secret","share_secret"}};
	public static final String[][]DATA_ARRAY = new String[][]{{"data","data_array"}};
	public static final String[][]DATA_LIST = new String[][]{{"data","data_list"}};
	public static final String[][]DATA_MAP = new String[][]{{"data","data_map"}};
	public static final String[][]DATA_CHAT_LIST = new String[][]{{"entities","data_chat_list"}};
	public static final String[][]DATA_ROOM = new String[][]{{"data","data_room"}};
	public static final String[][]DATA_ROOM_LIST = new String[][]{{"data","data_room_list"},{"public","public_room"}};
	public static final String[][]DATA_ROOM_REDO = new String[][]{{"data","data_room_rodo"}};
	public static final String[][]DATA_ROOM_REDO_LIST = new String[][]{{"data","data_room_redo_list"}};
	public static final String[][]DATA_GROUP = new String[][]{{"data","data_group"}};
	public static final String[][]DATA_GROUP_UPDATE = new String[][]{{"data","data_group_update"}};
	public static final String[][]DATA_GROUP_OWNER = new String[][]{{"data","data_group_owner"}};
	public static final String[][]DATA_GROUP_LIST = new String[][]{{"data","data_group_list"}};
	public static final String[][]DATA_GROUP_LIST_MEMBER = new String[][]{{"data","data_group_list_member"}};
	public static final String[][]DATA_GROUP_LIST_NEW = new String[][]{{"data","data_group_list_new"},{"public","public_group"}};
	public static final String[][]DATA_GROUP_FRIEND = new String[][]{{"data","data_group_friend"}};
	public static final String[][]DATA_GROUP_FRIEND_LIST = new String[][]{{"data","data_group_friend_list"}};
	private String access_token;
	private String action;
	private String application;
	private String applicationName;
	private Long count;
	private String cursor;
	private Integer duration;
	private Long expires_in;
	private String organization;
	private String path;
	private Integer statusCode;
	private Long timestamp;
	private String uri;
	private Map<String,Object>params;
	private TalkUser user;
	private List<TalkUser>entities;
	private String[]data_array;
	private Map<String,String>data_map;
	private List<Map<String,Object>>data_list;
	private List<TalkMsg>data_chat_list;
	private TalkRoom data_room;
	private List<TalkRoom>data_room_list;
	private TalkRoomRedo data_room_rodo;
	private List<TalkRoomRedo>data_room_redo_list;
	private TalkGroup data_group;
	private TalkGroupMember data_group_update;
	private TalkGroupMember data_group_owner;
	private List<TalkGroup>data_group_list;
	private List<TalkGroupMember>data_group_list_member;
	private List<TalkGroupNew>data_group_list_new;
	private TalkGroupFriend data_group_friend;
	private List<TalkGroupFriend>data_group_friend_list;
	public TalkNode() {}
	public TalkNode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getCursor() {
		return cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Long getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Long expires_in) {
		this.expires_in = expires_in;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public TalkUser getUser() {
		return user;
	}
	public void setUser(TalkUser user) {
		this.user = user;
	}
	public List<TalkUser> getEntities() {
		return entities;
	}
	public void setEntities(List<TalkUser> entities) {
		this.entities = entities;
	}
	public String[] getData_array() {
		return data_array;
	}
	public void setData_array(String[] data_array) {
		this.data_array = data_array;
	}
	public Map<String, String> getData_map() {
		return data_map;
	}
	public void setData_map(Map<String, String> data_map) {
		this.data_map = data_map;
	}
	public List<Map<String, Object>> getData_list() {
		return data_list;
	}
	public void setData_list(List<Map<String, Object>> data_list) {
		this.data_list = data_list;
	}
	public List<TalkMsg> getData_chat_list() {
		return data_chat_list;
	}
	public void setData_chat_list(List<TalkMsg> data_chat_list) {
		this.data_chat_list = data_chat_list;
	}
	public TalkRoom getData_room() {
		return data_room;
	}
	public void setData_room(TalkRoom data_room) {
		this.data_room = data_room;
	}
	public List<TalkRoom> getData_room_list() {
		return data_room_list;
	}
	public void setData_room_list(List<TalkRoom> data_room_list) {
		this.data_room_list = data_room_list;
	}
	public TalkRoomRedo getData_room_rodo() {
		return data_room_rodo;
	}
	public void setData_room_rodo(TalkRoomRedo data_room_rodo) {
		this.data_room_rodo = data_room_rodo;
	}
	public List<TalkRoomRedo> getData_room_redo_list() {
		return data_room_redo_list;
	}
	public void setData_room_redo_list(List<TalkRoomRedo> data_room_redo_list) {
		this.data_room_redo_list = data_room_redo_list;
	}
	public TalkGroup getData_group() {
		return data_group;
	}
	public void setData_group(TalkGroup data_group) {
		this.data_group = data_group;
	}
	public TalkGroupMember getData_group_update() {
		return data_group_update;
	}
	public void setData_group_update(TalkGroupMember data_group_update) {
		this.data_group_update = data_group_update;
	}
	public TalkGroupMember getData_group_owner() {
		return data_group_owner;
	}
	public void setData_group_owner(TalkGroupMember data_group_owner) {
		this.data_group_owner = data_group_owner;
	}
	public List<TalkGroup> getData_group_list() {
		return data_group_list;
	}
	public void setData_group_list(List<TalkGroup> data_group_list) {
		this.data_group_list = data_group_list;
	}
	public List<TalkGroupMember> getData_group_list_member() {
		return data_group_list_member;
	}
	public void setData_group_list_member(
			List<TalkGroupMember> data_group_list_member) {
		this.data_group_list_member = data_group_list_member;
	}
	public List<TalkGroupNew> getData_group_list_new() {
		return data_group_list_new;
	}
	public void setData_group_list_new(List<TalkGroupNew> data_group_list_new) {
		this.data_group_list_new = data_group_list_new;
	}
	public TalkGroupFriend getData_group_friend() {
		return data_group_friend;
	}
	public void setData_group_friend(TalkGroupFriend data_group_friend) {
		this.data_group_friend = data_group_friend;
	}
	public List<TalkGroupFriend> getData_group_friend_list() {
		return data_group_friend_list;
	}
	public void setData_group_friend_list(
			List<TalkGroupFriend> data_group_friend_list) {
		this.data_group_friend_list = data_group_friend_list;
	}
}
class TalkUser {
	private Boolean activated;
	private Long created;
	private Long modified;
	private String nickname;
	private String share_secret;
	private String type;
	private String username;
	private String uuid;
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Long getModified() {
		return modified;
	}
	public void setModified(Long modified) {
		this.modified = modified;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getShare_secret() {
		return share_secret;
	}
	public void setShare_secret(String share_secret) {
		this.share_secret = share_secret;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
class TalkGroup {
	private Long affiliations;
	private String created;
	private String groupid;
	private String groupname;
	private String last_modified;
	private String owner;
	private Boolean success;
	private String type;
	public Long getAffiliations() {
		return affiliations;
	}
	public void setAffiliations(Long affiliations) {
		this.affiliations = affiliations;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
class TalkGroupNew {
	private Long affiliations_count;
	private Boolean allowinvites;
	private String description;
	private String error;
	private String id;
	private Long maxusers;
	private Boolean membersonly;
	private String name;
	private Boolean public_group;
	private List<TalkGroupMember>affiliations;
	public Long getAffiliations_count() {
		return affiliations_count;
	}
	public void setAffiliations_count(Long affiliations_count) {
		this.affiliations_count = affiliations_count;
	}
	public Boolean getAllowinvites() {
		return allowinvites;
	}
	public void setAllowinvites(Boolean allowinvites) {
		this.allowinvites = allowinvites;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getMaxusers() {
		return maxusers;
	}
	public void setMaxusers(Long maxusers) {
		this.maxusers = maxusers;
	}
	public Boolean getMembersonly() {
		return membersonly;
	}
	public void setMembersonly(Boolean membersonly) {
		this.membersonly = membersonly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPublic_group() {
		return public_group;
	}
	public void setPublic_group(Boolean public_group) {
		this.public_group = public_group;
	}
	public List<TalkGroupMember> getAffiliations() {
		return affiliations;
	}
	public void setAffiliations(List<TalkGroupMember> affiliations) {
		this.affiliations = affiliations;
	}
}
class TalkGroupMember {
	private Boolean description;
	private Boolean groupname;
	private Boolean maxusers;
	private String member;
	private String newowner;
	private String owner;
	public Boolean getDescription() {
		return description;
	}
	public void setDescription(Boolean description) {
		this.description = description;
	}
	public Boolean getGroupname() {
		return groupname;
	}
	public void setGroupname(Boolean groupname) {
		this.groupname = groupname;
	}
	public Boolean getMaxusers() {
		return maxusers;
	}
	public void setMaxusers(Boolean maxusers) {
		this.maxusers = maxusers;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getNewowner() {
		return newowner;
	}
	public void setNewowner(String newowner) {
		this.newowner = newowner;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
class TalkGroupFriend {
	private String action;
	private String groupid;
	private String[]newmembers;
	private Boolean result;
	private String user;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String[] getNewmembers() {
		return newmembers;
	}
	public void setNewmembers(String[] newmembers) {
		this.newmembers = newmembers;
	}
	public Boolean isResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
class TalkChat {
	private String chat_type;
	private Long created;
	private String from;
	private String groupId;
	private String msg_id;
	private Long modified;
	private Long timestamp;
	private String to;
	private String type;
	private String uuid;
	private TalkChatPayload payload;
	public String getChat_type() {
		return chat_type;
	}
	public void setChat_type(String chat_type) {
		this.chat_type = chat_type;
	}
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}
	public Long getModified() {
		return modified;
	}
	public void setModified(Long modified) {
		this.modified = modified;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public TalkChatPayload getPayload() {
		return payload;
	}
	public void setPayload(TalkChatPayload payload) {
		this.payload = payload;
	}
}
class TalkChatPayload {
	private List<TalkChatBody>bodies;
	public List<TalkChatBody> getBodies() {
		return bodies;
	}
	public void setBodies(List<TalkChatBody> bodies) {
		this.bodies = bodies;
	}
}
class TalkChatBody {
	private String action;
	private String filename;
	private Long length;
	private String msg;
	private String secret;
	private String type;
	private String url;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
class TalkRoom {
	private Boolean allowinvites;
	private Integer affiliations_count;
	private String description;
	private String id;
	private Integer maxusers;
	private Boolean membersonly;
	private String name;
	private String owner;
	private Boolean public_room;
	private List<TalkRoomMember>affiliations;
	public Boolean getAllowinvites() {
		return allowinvites;
	}
	public void setAllowinvites(Boolean allowinvites) {
		this.allowinvites = allowinvites;
	}
	public Integer getAffiliations_count() {
		return affiliations_count;
	}
	public void setAffiliations_count(Integer affiliations_count) {
		this.affiliations_count = affiliations_count;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getMaxusers() {
		return maxusers;
	}
	public void setMaxusers(Integer maxusers) {
		this.maxusers = maxusers;
	}
	public Boolean getMembersonly() {
		return membersonly;
	}
	public void setMembersonly(Boolean membersonly) {
		this.membersonly = membersonly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Boolean getPublic_room() {
		return public_room;
	}
	public void setPublic_room(Boolean public_room) {
		this.public_room = public_room;
	}
	public List<TalkRoomMember> getAffiliations() {
		return affiliations;
	}
	public void setAffiliations(List<TalkRoomMember> affiliations) {
		this.affiliations = affiliations;
	}
}
class TalkRoomRedo {
	private String action;
	private Boolean description;
	private String id;
	private Boolean maxusers;
	private Boolean name;
	private String[]newmembers;
	private Boolean result;
	private Boolean success;
	private String user;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Boolean getDescription() {
		return description;
	}
	public void setDescription(Boolean description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getMaxusers() {
		return maxusers;
	}
	public void setMaxusers(Boolean maxusers) {
		this.maxusers = maxusers;
	}
	public Boolean getName() {
		return name;
	}
	public void setName(Boolean name) {
		this.name = name;
	}
	public String[] getNewmembers() {
		return newmembers;
	}
	public void setNewmembers(String[] newmembers) {
		this.newmembers = newmembers;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
class TalkRoomMember {
	private String member;
	private String owner;
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}