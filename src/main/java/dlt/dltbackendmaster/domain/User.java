package dlt.dltbackendmaster.domain;
// Generated Jan 16, 2022, 11:30:32 PM by Hibernate Tools 5.4.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int id;
	private EntryPoint entryPoint;
	private Locality locality;
	private Partner partner;
	private Profile profile;
	private Us us;
	private User userByUpdatedBy;
	private User userByCreatedBy;
	private String surname;
	private String name;
	private String phoneNumber;
	private String EMail;
	private String username;
	private String password;
	private int status;
	private Date dateCreated;
	private Date dateUpdated;
	private Set usersForUpdatedBy = new HashSet(0);
	private Set usersForCreatedBy = new HashSet(0);
	private Set localitiesForUpdatedBy = new HashSet(0);
	private Set provincesForUpdatedBy = new HashSet(0);
	private Set localitiesForCreatedBy = new HashSet(0);
	private Set provincesForCreatedBy = new HashSet(0);
	private Set usesForCreatedBy = new HashSet(0);
	private Set partnerTypesForCreatedBy = new HashSet(0);
	private Set partnerTypesForUpdatedBy = new HashSet(0);
	private Set usesForUpdatedBy = new HashSet(0);
	private Set neighborhoodsForCreatedBy = new HashSet(0);
	private Set profilesForUpdatedBy = new HashSet(0);
	private Set districtsForUpdatedBy = new HashSet(0);
	private Set profilesForCreatedBy = new HashSet(0);
	private Set districtsForCreatedBy = new HashSet(0);
	private Set neighborhoodsForUpdatedBy = new HashSet(0);
	private Set entryPointsForUpdatedBy = new HashSet(0);
	private Set usTypesForUpdatedBy = new HashSet(0);
	private Set partnersForCreatedBy = new HashSet(0);
	private Set partnersForUpdatedBy = new HashSet(0);
	private Set usTypesForCreatedBy = new HashSet(0);
	private Set entryPointsForCreatedBy = new HashSet(0);

	public User() {
	}

	public User(int id, Partner partner, Profile profile, User userByCreatedBy, String surname, String name,
			String phoneNumber, String EMail, String username, String password, int status, Date dateCreated) {
		this.id = id;
		this.partner = partner;
		this.profile = profile;
		this.userByCreatedBy = userByCreatedBy;
		this.surname = surname;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.EMail = EMail;
		this.username = username;
		this.password = password;
		this.status = status;
		this.dateCreated = dateCreated;
	}

	public User(int id, EntryPoint entryPoint, Locality locality, Partner partner, Profile profile, Us us,
			User userByUpdatedBy, User userByCreatedBy, String surname, String name, String phoneNumber, String EMail,
			String username, String password, int status, Date dateCreated, Date dateUpdated, Set usersForUpdatedBy,
			Set usersForCreatedBy, Set localitiesForUpdatedBy, Set provincesForUpdatedBy, Set localitiesForCreatedBy,
			Set provincesForCreatedBy, Set usesForCreatedBy, Set partnerTypesForCreatedBy, Set partnerTypesForUpdatedBy,
			Set usesForUpdatedBy, Set neighborhoodsForCreatedBy, Set profilesForUpdatedBy, Set districtsForUpdatedBy,
			Set profilesForCreatedBy, Set districtsForCreatedBy, Set neighborhoodsForUpdatedBy,
			Set entryPointsForUpdatedBy, Set usTypesForUpdatedBy, Set partnersForCreatedBy, Set partnersForUpdatedBy,
			Set usTypesForCreatedBy, Set entryPointsForCreatedBy) {
		this.id = id;
		this.entryPoint = entryPoint;
		this.locality = locality;
		this.partner = partner;
		this.profile = profile;
		this.us = us;
		this.userByUpdatedBy = userByUpdatedBy;
		this.userByCreatedBy = userByCreatedBy;
		this.surname = surname;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.EMail = EMail;
		this.username = username;
		this.password = password;
		this.status = status;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.usersForUpdatedBy = usersForUpdatedBy;
		this.usersForCreatedBy = usersForCreatedBy;
		this.localitiesForUpdatedBy = localitiesForUpdatedBy;
		this.provincesForUpdatedBy = provincesForUpdatedBy;
		this.localitiesForCreatedBy = localitiesForCreatedBy;
		this.provincesForCreatedBy = provincesForCreatedBy;
		this.usesForCreatedBy = usesForCreatedBy;
		this.partnerTypesForCreatedBy = partnerTypesForCreatedBy;
		this.partnerTypesForUpdatedBy = partnerTypesForUpdatedBy;
		this.usesForUpdatedBy = usesForUpdatedBy;
		this.neighborhoodsForCreatedBy = neighborhoodsForCreatedBy;
		this.profilesForUpdatedBy = profilesForUpdatedBy;
		this.districtsForUpdatedBy = districtsForUpdatedBy;
		this.profilesForCreatedBy = profilesForCreatedBy;
		this.districtsForCreatedBy = districtsForCreatedBy;
		this.neighborhoodsForUpdatedBy = neighborhoodsForUpdatedBy;
		this.entryPointsForUpdatedBy = entryPointsForUpdatedBy;
		this.usTypesForUpdatedBy = usTypesForUpdatedBy;
		this.partnersForCreatedBy = partnersForCreatedBy;
		this.partnersForUpdatedBy = partnersForUpdatedBy;
		this.usTypesForCreatedBy = usTypesForCreatedBy;
		this.entryPointsForCreatedBy = entryPointsForCreatedBy;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntryPoint getEntryPoint() {
		return this.entryPoint;
	}

	public void setEntryPoint(EntryPoint entryPoint) {
		this.entryPoint = entryPoint;
	}

	public Locality getLocality() {
		return this.locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Us getUs() {
		return this.us;
	}

	public void setUs(Us us) {
		this.us = us;
	}

	public User getUserByUpdatedBy() {
		return this.userByUpdatedBy;
	}

	public void setUserByUpdatedBy(User userByUpdatedBy) {
		this.userByUpdatedBy = userByUpdatedBy;
	}

	public User getUserByCreatedBy() {
		return this.userByCreatedBy;
	}

	public void setUserByCreatedBy(User userByCreatedBy) {
		this.userByCreatedBy = userByCreatedBy;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Set getUsersForUpdatedBy() {
		return this.usersForUpdatedBy;
	}

	public void setUsersForUpdatedBy(Set usersForUpdatedBy) {
		this.usersForUpdatedBy = usersForUpdatedBy;
	}

	public Set getUsersForCreatedBy() {
		return this.usersForCreatedBy;
	}

	public void setUsersForCreatedBy(Set usersForCreatedBy) {
		this.usersForCreatedBy = usersForCreatedBy;
	}

	public Set getLocalitiesForUpdatedBy() {
		return this.localitiesForUpdatedBy;
	}

	public void setLocalitiesForUpdatedBy(Set localitiesForUpdatedBy) {
		this.localitiesForUpdatedBy = localitiesForUpdatedBy;
	}

	public Set getProvincesForUpdatedBy() {
		return this.provincesForUpdatedBy;
	}

	public void setProvincesForUpdatedBy(Set provincesForUpdatedBy) {
		this.provincesForUpdatedBy = provincesForUpdatedBy;
	}

	public Set getLocalitiesForCreatedBy() {
		return this.localitiesForCreatedBy;
	}

	public void setLocalitiesForCreatedBy(Set localitiesForCreatedBy) {
		this.localitiesForCreatedBy = localitiesForCreatedBy;
	}

	public Set getProvincesForCreatedBy() {
		return this.provincesForCreatedBy;
	}

	public void setProvincesForCreatedBy(Set provincesForCreatedBy) {
		this.provincesForCreatedBy = provincesForCreatedBy;
	}

	public Set getUsesForCreatedBy() {
		return this.usesForCreatedBy;
	}

	public void setUsesForCreatedBy(Set usesForCreatedBy) {
		this.usesForCreatedBy = usesForCreatedBy;
	}

	public Set getPartnerTypesForCreatedBy() {
		return this.partnerTypesForCreatedBy;
	}

	public void setPartnerTypesForCreatedBy(Set partnerTypesForCreatedBy) {
		this.partnerTypesForCreatedBy = partnerTypesForCreatedBy;
	}

	public Set getPartnerTypesForUpdatedBy() {
		return this.partnerTypesForUpdatedBy;
	}

	public void setPartnerTypesForUpdatedBy(Set partnerTypesForUpdatedBy) {
		this.partnerTypesForUpdatedBy = partnerTypesForUpdatedBy;
	}

	public Set getUsesForUpdatedBy() {
		return this.usesForUpdatedBy;
	}

	public void setUsesForUpdatedBy(Set usesForUpdatedBy) {
		this.usesForUpdatedBy = usesForUpdatedBy;
	}

	public Set getNeighborhoodsForCreatedBy() {
		return this.neighborhoodsForCreatedBy;
	}

	public void setNeighborhoodsForCreatedBy(Set neighborhoodsForCreatedBy) {
		this.neighborhoodsForCreatedBy = neighborhoodsForCreatedBy;
	}

	public Set getProfilesForUpdatedBy() {
		return this.profilesForUpdatedBy;
	}

	public void setProfilesForUpdatedBy(Set profilesForUpdatedBy) {
		this.profilesForUpdatedBy = profilesForUpdatedBy;
	}

	public Set getDistrictsForUpdatedBy() {
		return this.districtsForUpdatedBy;
	}

	public void setDistrictsForUpdatedBy(Set districtsForUpdatedBy) {
		this.districtsForUpdatedBy = districtsForUpdatedBy;
	}

	public Set getProfilesForCreatedBy() {
		return this.profilesForCreatedBy;
	}

	public void setProfilesForCreatedBy(Set profilesForCreatedBy) {
		this.profilesForCreatedBy = profilesForCreatedBy;
	}

	public Set getDistrictsForCreatedBy() {
		return this.districtsForCreatedBy;
	}

	public void setDistrictsForCreatedBy(Set districtsForCreatedBy) {
		this.districtsForCreatedBy = districtsForCreatedBy;
	}

	public Set getNeighborhoodsForUpdatedBy() {
		return this.neighborhoodsForUpdatedBy;
	}

	public void setNeighborhoodsForUpdatedBy(Set neighborhoodsForUpdatedBy) {
		this.neighborhoodsForUpdatedBy = neighborhoodsForUpdatedBy;
	}

	public Set getEntryPointsForUpdatedBy() {
		return this.entryPointsForUpdatedBy;
	}

	public void setEntryPointsForUpdatedBy(Set entryPointsForUpdatedBy) {
		this.entryPointsForUpdatedBy = entryPointsForUpdatedBy;
	}

	public Set getUsTypesForUpdatedBy() {
		return this.usTypesForUpdatedBy;
	}

	public void setUsTypesForUpdatedBy(Set usTypesForUpdatedBy) {
		this.usTypesForUpdatedBy = usTypesForUpdatedBy;
	}

	public Set getPartnersForCreatedBy() {
		return this.partnersForCreatedBy;
	}

	public void setPartnersForCreatedBy(Set partnersForCreatedBy) {
		this.partnersForCreatedBy = partnersForCreatedBy;
	}

	public Set getPartnersForUpdatedBy() {
		return this.partnersForUpdatedBy;
	}

	public void setPartnersForUpdatedBy(Set partnersForUpdatedBy) {
		this.partnersForUpdatedBy = partnersForUpdatedBy;
	}

	public Set getUsTypesForCreatedBy() {
		return this.usTypesForCreatedBy;
	}

	public void setUsTypesForCreatedBy(Set usTypesForCreatedBy) {
		this.usTypesForCreatedBy = usTypesForCreatedBy;
	}

	public Set getEntryPointsForCreatedBy() {
		return this.entryPointsForCreatedBy;
	}

	public void setEntryPointsForCreatedBy(Set entryPointsForCreatedBy) {
		this.entryPointsForCreatedBy = entryPointsForCreatedBy;
	}

}
