package dlt.dltbackendmaster.domain;
// Generated Jan 16, 2022, 11:30:32 PM by Hibernate Tools 5.4.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Partner generated by hbm2java
 */
public class Partner implements java.io.Serializable {

	private int id;
	private District district;
	private PartnerType partnerType;
	private User userByCreatedBy;
	private User userByUpdatedBy;
	private String name;
	private String abbreviation;
	private String description;
	private String logo;
	private int status;
	private Date dateCreated;
	private Date dateUpdated;
	private Set users = new HashSet(0);

	public Partner() {
	}

	public Partner(int id, PartnerType partnerType, User userByCreatedBy, String name, int status, Date dateCreated) {
		this.id = id;
		this.partnerType = partnerType;
		this.userByCreatedBy = userByCreatedBy;
		this.name = name;
		this.status = status;
		this.dateCreated = dateCreated;
	}

	public Partner(int id, District district, PartnerType partnerType, User userByCreatedBy, User userByUpdatedBy,
			String name, String abbreviation, String description, String logo, int status, Date dateCreated,
			Date dateUpdated, Set users) {
		this.id = id;
		this.district = district;
		this.partnerType = partnerType;
		this.userByCreatedBy = userByCreatedBy;
		this.userByUpdatedBy = userByUpdatedBy;
		this.name = name;
		this.abbreviation = abbreviation;
		this.description = description;
		this.logo = logo;
		this.status = status;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.users = users;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public PartnerType getPartnerType() {
		return this.partnerType;
	}

	public void setPartnerType(PartnerType partnerType) {
		this.partnerType = partnerType;
	}

	public User getUserByCreatedBy() {
		return this.userByCreatedBy;
	}

	public void setUserByCreatedBy(User userByCreatedBy) {
		this.userByCreatedBy = userByCreatedBy;
	}

	public User getUserByUpdatedBy() {
		return this.userByUpdatedBy;
	}

	public void setUserByUpdatedBy(User userByUpdatedBy) {
		this.userByUpdatedBy = userByUpdatedBy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
