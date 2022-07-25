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
 * Partners generated by hbm2java
 */
@Entity
@Table(name = "partners", catalog = "dreams_db")
@NamedQueries({
    @NamedQuery(name = "Partners.findAll", query = "SELECT c FROM Partners c"),
    @NamedQuery(name = "Partners.findByDateCreated", query = "SELECT c FROM Partners c WHERE c.dateCreated = :lastpulledat"),
    @NamedQuery(name = "Partners.findByDateUpdated", query = "SELECT c FROM Partners c WHERE c.dateUpdated = :lastpulledat")})
public class Partners implements java.io.Serializable {

	private Integer id;
	private District district;
	private String name;
	private String abbreviation;
	private String description;
	private String partnerType;
	private String logo;
	private int status;
	private int createdBy;
	private Date dateCreated;
	private Integer updatedBy;
	private Date dateUpdated;
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Beneficiaries> beneficiarieses = new HashSet<Beneficiaries>(0);

	public Partners() {
	}

	public Partners(String name, String partnerType, int status, int createdBy, Date dateCreated) {
		this.name = name;
		this.partnerType = partnerType;
		this.status = status;
		this.createdBy = createdBy;
		this.dateCreated = dateCreated;
	}

	public Partners(District district, String name, String abbreviation, String description, String partnerType,
			String logo, int status, int createdBy, Date dateCreated, Integer updatedBy, Date dateUpdated,
			Set<Users> userses, Set<Beneficiaries> beneficiarieses) {
		this.district = district;
		this.name = name;
		this.abbreviation = abbreviation;
		this.description = description;
		this.partnerType = partnerType;
		this.logo = logo;
		this.status = status;
		this.createdBy = createdBy;
		this.dateCreated = dateCreated;
		this.updatedBy = updatedBy;
		this.dateUpdated = dateUpdated;
		this.userses = userses;
		this.beneficiarieses = beneficiarieses;
	}
	
	public Partners(Integer id) {
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

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "district_id")
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

	@Column(name = "abbreviation", length = 150)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Column(name = "description", length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "partner_type", nullable = false, length = 50)
	public String getPartnerType() {
		return this.partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	@Column(name = "logo", length = 250)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "partners")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "partners")
	public Set<Beneficiaries> getBeneficiarieses() {
		return this.beneficiarieses;
	}

	public void setBeneficiarieses(Set<Beneficiaries> beneficiarieses) {
		this.beneficiarieses = beneficiarieses;
	}

	public ObjectNode toObjectNode() {
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode partner = mapper.createObjectNode();
		partner.put("id", id);
		partner.put("name", name);
		partner.put("abbreviation", abbreviation);
		partner.put("description", description);
		partner.put("status", status);
		partner.put("online_id", id); // flag to control if entity is synchronized with the backend
		return partner;
	} 
}
