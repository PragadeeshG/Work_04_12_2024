package com.test1;

public class NginxTypeServerConfig {
	private Integer typeIpNumber;
	private String typeServerDNS;
	private String roundRobin;
	private String leastConnection;
	private String ipHash;
	private Integer genericHash;
	private String leastTime;
	private String header;
	private Integer lastByte;
	private String lastByteInflight;
	private String leastTimeHeader;
	private String leastTimeLastByte;
	private String monitorStorage;

	public NginxTypeServerConfig() {

	}

	public NginxTypeServerConfig(Integer typeIpNumber, String typeServerDNS, String roundRobin, String leastConnection,
			String ipHash, Integer genericHash, String leastTime, String header, Integer lastByte,
			String lastByteInflight, String leastTimeHeader, String leastTimeLastByte, String monitorStorage) {
		super();
		this.typeIpNumber = typeIpNumber;
		this.typeServerDNS = typeServerDNS;
		this.roundRobin = roundRobin;
		this.leastConnection = leastConnection;
		this.ipHash = ipHash;
		this.genericHash = genericHash;
		this.leastTime = leastTime;
		this.header = header;
		this.lastByte = lastByte;
		this.lastByteInflight = lastByteInflight;
		this.leastTimeHeader = leastTimeHeader;
		this.leastTimeLastByte = leastTimeLastByte;
		this.monitorStorage = monitorStorage;
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

	public String getRoundRobin() {
		return roundRobin;
	}

	public void setRoundRobin(String roundRobin) {
		this.roundRobin = roundRobin;
	}

	public String getLeastConnection() {
		return leastConnection;
	}

	public void setLeastConnection(String leastConnection) {
		this.leastConnection = leastConnection;
	}

	public String getIpHash() {
		return ipHash;
	}

	public void setIpHash(String ipHash) {
		this.ipHash = ipHash;
	}

	public Integer getGenericHash() {
		return genericHash;
	}

	public void setGenericHash(Integer genericHash) {
		this.genericHash = genericHash;
	}

	public String getLeastTime() {
		return leastTime;
	}

	public void setLeastTime(String leastTime) {
		this.leastTime = leastTime;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getLastByte() {
		return lastByte;
	}

	public void setLastByte(Integer lastByte) {
		this.lastByte = lastByte;
	}

	public String getLastByteInflight() {
		return lastByteInflight;
	}

	public void setLastByteInflight(String lastByteInflight) {
		this.lastByteInflight = lastByteInflight;
	}

	public String getLeastTimeHeader() {
		return leastTimeHeader;
	}

	public void setLeastTimeHeader(String leastTimeHeader) {
		this.leastTimeHeader = leastTimeHeader;
	}

	public String getLeastTimeLastByte() {
		return leastTimeLastByte;
	}

	public void setLeastTimeLastByte(String leastTimeLastByte) {
		this.leastTimeLastByte = leastTimeLastByte;
	}

	public String getMonitorStorage() {
		return monitorStorage;
	}

	public void setMonitorStorage(String monitorStorage) {
		this.monitorStorage = monitorStorage;
	}

}
