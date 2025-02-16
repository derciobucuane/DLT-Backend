package dlt.dltbackendmaster.domain;
// Generated Jan 25, 2022, 4:05:43 PM by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import dlt.dltbackendmaster.serializers.UsTypeSerializer;

/**
 * Us generated by hbm2java
 */
@Entity
@Table(name = "us", catalog = "dreams_db")
public class Us implements java.io.Serializable {

	private Integer id;
	private UsType usType;
	private String code;
	private String name;
	private String description;
	private Float latitude;
	private Float longitude;
	private int localityId;
	private int status;
	private int createdBy;
	private Date createdAt;
	private Integer updatedBy;
	private Date updatedAt;
	private String offlineId;
	private Set<Users> userses = new HashSet<Users>(0);

	public Us() {
	}

	public Us(UsType usType, String code, String name, int localityId, int status, int createdBy, Date dateCreated) {
		this.usType = usType;
		this.code = code;
		this.name = name;
		this.localityId = localityId;
		this.status = status;
		this.createdBy = createdBy;
		this.createdAt = dateCreated;
	}

	public Us(UsType usType, String code, String name, String description, Float latitude, Float longitude,
			int localityId, int status, int createdBy, Date dateCreated, Integer updatedBy, Date dateUpdated,
			Set<Users> userses) {
		this.usType = usType;
		this.code = code;
		this.name = name;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.localityId = localityId;
		this.status = status;
		this.createdBy = createdBy;
		this.createdAt = dateCreated;
		this.updatedBy = updatedBy;
		this.updatedAt = dateUpdated;
		this.userses = userses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "us_type_id", nullable = false)
	@JsonProperty("usType")
	@JsonSerialize(using=UsTypeSerializer.class)
	public UsType getUsType() {
		return this.usType;
	}

	public void setUsType(UsType usType) {
		this.usType = usType;
	}

	@Column(name = "code", nullable = false, length = 150)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 150)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "latitude", precision = 12, scale = 0)
	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", precision = 12, scale = 0)
	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	@Column(name = "locality_id", nullable = false)
	public int getLocalityId() {
		return this.localityId;
	}

	public void setLocalityId(int localityId) {
		this.localityId = localityId;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "created_by", nullable = false)
	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date dateCreated) {
		this.createdAt = dateCreated;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date dateUpdated) {
		this.updatedAt = dateUpdated;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "us")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}
	
	

}
