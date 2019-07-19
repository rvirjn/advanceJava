package com.github.rvirjn;

public class Credential {
    private String entityUUID;
    private String userName;
    private String hostDNSName;
    private String hostManagementIP;
    private String hostPrivateIP;
    private String password;
    private String credentialId;
    private EntityType entityType;
    private CredentialType credentialType;

    public String getEntityUUID() {
        return entityUUID;
    }

    public void setEntityUUID(String entityUUID) {
        this.entityUUID = entityUUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHostDNSName() {
        return hostDNSName;
    }

    public void setHostDNSName(String hostDNSName) {
        this.hostDNSName = hostDNSName;
    }

    public String getHostManagementIP() {
        return hostManagementIP;
    }

    public void setHostManagementIP(String hostManagementIP) {
        this.hostManagementIP = hostManagementIP;
    }

    public String getHostPrivateIP() {
        return hostPrivateIP;
    }

    public void setHostPrivateIP(String hostPrivateIP) {
        this.hostPrivateIP = hostPrivateIP;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }
    public static enum CredentialType {
        SSO,
        SSH,
        /** @deprecated */
        @Deprecated
        SSH_INITIAL,
        API,
        BASIC_AUTH,
        Administrator,
        FTP,
        JDBC,
        LDAP_DOMAIN_ADMIN,
        LDAP_READ_WRITE_ACCOUNT,
        VDI_ADMIN,
        SQL_SUPER_USER,
        SQL_DB_OWNER,
        SERVICE_ACCOUNT,
        BACKUP_PASSPHRASE;

        private CredentialType() {
        }
    }
    public static enum EntityType {
        ESXI,
        SDDC_MANAGER,
        VCENTER,
        VSAN,
        PSC,
        NSX_MANAGER,
        NSX_CONTROLLER,
        NSX_EDGE,
        NSXT_MANAGER,
        /** @deprecated */
        @Deprecated
        NSXT_CONTROLLER,
        NSXT_EDGE,
        VRLI,
        VROPS,
        LCM_REPO,
        VRA,
        BACKUP,
        VRSLCM,
        DEPOT_USER,
        COMPOSABLE_INFRA,
        DELL_DEPOT_USER,
        VXRAIL_MANAGER,
        AD,
        SQL,
        UAG,
        WINDOWS,
        COMPOSER_SERVER,
        PIVOTAL_CLOUD_FOUNDRY,
        PIVOTAL_CONTAINER_SERVICE;

        private EntityType() {
        }
    }
}
