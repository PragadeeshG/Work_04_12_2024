package com.test1;

public class NginxTypeServers {
	private Integer typeIpNumber;
	private String typeServerDNS;
	private String httpProxyForServerGroup;
	private String serverDirective;
	private String groupServersConfigLocation;
	private String loadBalancingType;
	private long serverLocation;
	private String proxyLabel;
	private String backupOpts;
	private String mainWebServer;
	private String entityState;

	public NginxTypeServers() {

	}

	public NginxTypeServers(Integer typeIpNumber, String typeServerDNS, String httpProxyForServerGroup,
			String serverDirective, String groupServersConfigLocation, String loadBalancingType, long serverLocation,
			String proxyLabel, String backupOpts, String mainWebServer, String entityState) {
		super();
		this.typeIpNumber = typeIpNumber;
		this.typeServerDNS = typeServerDNS;
		this.httpProxyForServerGroup = httpProxyForServerGroup;
		this.serverDirective = serverDirective;
		this.groupServersConfigLocation = groupServersConfigLocation;
		this.loadBalancingType = loadBalancingType;
		this.serverLocation = serverLocation;
		this.proxyLabel = proxyLabel;
		this.backupOpts = backupOpts;
		this.mainWebServer = mainWebServer;
		this.entityState = entityState;
	}

	public Integer getTypeIpNumber() {
		return typeIpNumber;
	}

	public void setTypeIpNumber(Integer typeIpNumber) {
		this.typeIpNumber = typeIpNumber;
	}

	public String getTypeServerDNS() {
		return typeServerDNS;
	}

	public void setTypeServerDNS(String typeServerDNS) {
		this.typeServerDNS = typeServerDNS;
	}

	public String getHttpProxyForServerGroup() {
		return httpProxyForServerGroup;
	}

	public void setHttpProxyForServerGroup(String httpProxyForServerGroup) {
		this.httpProxyForServerGroup = httpProxyForServerGroup;
	}

	public String getServerDirective() {
		return serverDirective;
	}

	public void setServerDirective(String serverDirective) {
		this.serverDirective = serverDirective;
	}

	public String getGroupServersConfigLocation() {
		return groupServersConfigLocation;
	}

	public void setGroupServersConfigLocation(String groupServersConfigLocation) {
		this.groupServersConfigLocation = groupServersConfigLocation;
	}

	public String getLoadBalancingType() {
		return loadBalancingType;
	}

	public void setLoadBalancingType(String loadBalancingType) {
		this.loadBalancingType = loadBalancingType;
	}

	public long getServerLocation() {
		return serverLocation;
	}

	public void setServerLocation(long serverLocation) {
		this.serverLocation = serverLocation;
	}

	public String getProxyLabel() {
		return proxyLabel;
	}

	public void setProxyLabel(String proxyLabel) {
		this.proxyLabel = proxyLabel;
	}

	public String getBackupOpts() {
		return backupOpts;
	}

	public void setBackupOpts(String backupOpts) {
		this.backupOpts = backupOpts;
	}

	public String getMainWebServer() {
		return mainWebServer;
	}

	public void setMainWebServer(String mainWebServer) {
		this.mainWebServer = mainWebServer;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
