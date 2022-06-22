package dlt.dltbackendmaster.domain;
// Generated Jun 13, 2022, 9:37:47 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Locality generated by hbm2java
 */
@Entity
@Table(name = "locality", catalog = "dreams_db")
@NamedQueries({
    @NamedQuery(name = "Locality.findAll", query = "SELECT c FROM Locality c"),
    @NamedQuery(name = "Locality.findByDateCreated", query = "SELECT c FROM Locality c WHERE c.dateCreated = :lastpulledat"),
    @NamedQuery(name = "Locality.findByDistricts", query = "SELECT c FROM Locality c WHERE c.district.id in (:districts)"),
    @NamedQuery(name = "Locality.findByDateUpdated", query = "SELECT c FROM Locality c WHERE c.dateUpdated = :lastpulledat")})
public class Locality implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private District district;
	private String name;
	private String description;
	private int status;
	private int createdBy;
	private Date dateCreated;
	private Integer updatedBy;
	private Date dateUpdated;
	private Set<Neighborhood> neighborhoods = new HashSet<Neighborhood>(0);
	private Set<Users> userses = new HashSet<Users>(0);

	public Locality() {
	}

	public Locality(District district, String name, int status, int createdBy, Date dateCreated) {
		this.district = district;
		this.name = name;
		this.status = status;
		this.createdBy = createdBy;
		this.dateCreated = dateCreated;
	}

	public Locality(District district, String name, String description, int status, int createdBy, Date dateCreated,
			Integer updatedBy, Date dateUpdated, Set<Neighborhood> neighborhoods, Set<Users> userses) {
		this.district = district;
		this.name = name;
		this.description = description;
		this.status = status;
		this.createdBy = createdBy;
		this.dateCreated = dateCreated;
		this.updatedBy = updatedBy;
		this.dateUpdated = dateUpdated;
		this.neighborhoods = neighborhoods;
		this.userses = userses;
	}
	
	public Locality(Integer id) {
		this.id = id;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "district_id", nullable = false)
	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
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
	@Column(name = "date_created", nullable = false, length = 19)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_updated", length = 19)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "locality")
	public Set<Neighborhood> getNeighborhoods() {
		return this.neighborhoods;
	}

	public void setNeighborhoods(Set<Neighborhood> neighborhoods) {
		this.neighborhoods = neighborhoods;
	}

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_localities", catalog = "dreams_db", joinColumns = {
			@JoinColumn(name = "locality_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "user_id", nullable = false, updatable = false) })
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	public ObjectNode toObjectNode() {
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode locality = mapper.createObjectNode();
		locality.put("id", id);
		locality.put("name", name);
	    locality.put("description", description);
	    locality.put("status", status);
	    locality.put("online_id", id); // flag to control if entity is synchronized with the backend
		return locality;
	} 
}
