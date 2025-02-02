package com.easemob.im.server.api.group.settings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateGroupRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("allowinvites")
    private Boolean canMemberInviteOthers;

    @JsonProperty("invite_need_confirm")
    private Boolean needInviteConfirm;

    @JsonProperty("membersonly")
    private Boolean needApproveToJoin;

    @JsonProperty("maxusers")
    private Integer maxMembers;

    @JsonProperty("custom")
    private String custom;

    @JsonProperty("need_verify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean needVerify;

    public UpdateGroupRequest() {
        this.name = null;
        this.description = null;
        this.canMemberInviteOthers = null;
        this.needInviteConfirm = null;
        this.needApproveToJoin = null;
        this.maxMembers = null;
        this.custom = null;
    }

    @JsonCreator
    public UpdateGroupRequest(@JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("allowinvites") Boolean canMemberInviteOthers,
            @JsonProperty("membersonly") Boolean needApproveToJoin,
            @JsonProperty("maxusers") Integer maxMembers) {
        this.name = name;
        this.description = description;
        this.canMemberInviteOthers = canMemberInviteOthers;
        this.needApproveToJoin = needApproveToJoin;
        this.maxMembers = maxMembers;
    }

    @JsonCreator
    public UpdateGroupRequest(@JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("allowinvites") Boolean canMemberInviteOthers,
            @JsonProperty("membersonly") Boolean needApproveToJoin,
            @JsonProperty("maxusers") Integer maxMembers,
            @JsonProperty("custom") String custom) {
        this.name = name;
        this.description = description;
        this.canMemberInviteOthers = canMemberInviteOthers;
        this.needApproveToJoin = needApproveToJoin;
        this.maxMembers = maxMembers;
        this.custom = custom;
    }

    @JsonCreator
    public UpdateGroupRequest(@JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("allowinvites") Boolean canMemberInviteOthers,
            @JsonProperty("invite_need_confirm") Boolean needInviteConfirm,
            @JsonProperty("membersonly") Boolean needApproveToJoin,
            @JsonProperty("maxusers") Integer maxMembers,
            @JsonProperty("custom") String custom) {
        this.name = name;
        this.description = description;
        this.canMemberInviteOthers = canMemberInviteOthers;
        this.needInviteConfirm = needInviteConfirm;
        this.needApproveToJoin = needApproveToJoin;
        this.maxMembers = maxMembers;
        this.custom = custom;
    }

    @JsonCreator
    public UpdateGroupRequest(@JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("allowinvites") Boolean canMemberInviteOthers,
            @JsonProperty("invite_need_confirm") Boolean needInviteConfirm,
            @JsonProperty("membersonly") Boolean needApproveToJoin,
            @JsonProperty("maxusers") Integer maxMembers,
            @JsonProperty("custom") String custom,
            @JsonProperty("need_verify")  Boolean needVerify) {
        this.name = name;
        this.description = description;
        this.canMemberInviteOthers = canMemberInviteOthers;
        this.needInviteConfirm = needInviteConfirm;
        this.needApproveToJoin = needApproveToJoin;
        this.maxMembers = maxMembers;
        this.custom = custom;
        this.needVerify = needVerify;
    }

    public String getName() {
        return name;
    }

    public UpdateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getCanMemberInviteOthers() {
        return canMemberInviteOthers;
    }

    public UpdateGroupRequest setCanMemberInviteOthers(Boolean canMemberInviteOthers) {
        this.canMemberInviteOthers = canMemberInviteOthers;
        return this;
    }

    public Boolean getNeedApproveToJoin() {
        return needApproveToJoin;
    }

    public UpdateGroupRequest setNeedApproveToJoin(Boolean needApproveToJoin) {
        this.needApproveToJoin = needApproveToJoin;
        return this;
    }

    public Boolean getNeedInviteConfirm() {
        return needInviteConfirm;
    }

    public UpdateGroupRequest setNeedInviteConfirm(Boolean needInviteConfirm) {
        this.needInviteConfirm = needInviteConfirm;
        return this;
    }

    public Integer getMaxMembers() {
        return maxMembers;
    }

    public UpdateGroupRequest setMaxMembers(Integer maxMembers) {
        this.maxMembers = maxMembers;
        return this;
    }

    public String getCustom() {
        return custom;
    }

    public UpdateGroupRequest setCustom(String custom) {
        this.custom = custom;
        return this;
    }

    public UpdateGroupRequest setNeedVerify(Boolean needVerify) {
        this.needVerify = needVerify;
        return this;
    }

    public Boolean getNeedVerify() {
        return needVerify;
    }

}
