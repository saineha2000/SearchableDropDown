package net.javaguidesspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="component1")
public class page1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "present_stage")
	private String presentStage;
	@Column(name="number_status")
	private String numberStatus;
	@Column(name = "number_address_status")
	private String numberAddressStatus;
	@Column(name = "error_notes")
	private String errorNotes;
	
	@Column(name = "request_no")
	private String requestNumber;
	
	
	@Column(name="country")
	private String countryOfOrigin;
	
	@Column(name="access_type")
	private String accessType;
	
	
	@Column(name = "access_no_workflow")
	private String bulkAccessNoWorkflow;
	
	@Column(name = "sio_date")
	private Date sioAcceptanceDate;
	
	@Column(name = "commit_date")
	private Date commitDate;
	
	
	@Column(name="multiBuild")
	private Boolean multiBuild;
	//2nd component
	@Column(name = "search_type")
	private String searchType;
	
	@Column(name="country2")
	private String country;
	
	@Column(name="switchdd")
	private String switchdd;
	
	@Column(name="search_no")
	private Long search_no;
	
	@Column(name="quantity")
	private Long quantity;
	
	@Column(name="radio_button_value")
	private String radio_button_value;
	
	@Column(name="auto_look_up")
	private Boolean auto_look_up;
	
	@Column(name="exact")
	private Boolean exact;
	
	public Boolean getAuto_look_up() {
		return auto_look_up;
	}
	public void setAuto_look_up(Boolean auto_look_up) {
		this.auto_look_up = auto_look_up;
	}
	public Boolean getExact() {
		return exact;
	}
	public void setExact(Boolean exact) {
		this.exact = exact;
	}
	public String getRadio_button_value() {
		return radio_button_value;
	}
	public void setRadio_button_value(String radio_button_value) {
		this.radio_button_value = radio_button_value;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSwitchdd() {
		return switchdd;
	}
	public void setSwitchdd(String switchdd) {
		this.switchdd = switchdd;
	}
	public Long getSearch_no() {
		return search_no;
	}
	public void setSearch_no(Long search_no) {
		this.search_no = search_no;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Boolean getMultiBuild() {
		return multiBuild;
	}
	public void setMultiBuild(Boolean multiBuild) {
		this.multiBuild = multiBuild;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	
	
	
	public page1(long id, String presentStage, String numberStatus, String numberAddressStatus, String errorNotes,
			String requestNumber, String countryOfOrigin, String accessType, String bulkAccessNoWorkflow,
			Date sioAcceptanceDate, Date commitDate, Boolean multiBuild, String searchType, String country,
			String switchdd, Long search_no, Long quantity,String radio_button_value,Boolean auto_look_up,Boolean exact) {
		super();
		this.id = id;
		this.presentStage = presentStage;
		this.numberStatus = numberStatus;
		this.numberAddressStatus = numberAddressStatus;
		this.errorNotes = errorNotes;
		this.requestNumber = requestNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.accessType = accessType;
		this.bulkAccessNoWorkflow = bulkAccessNoWorkflow;
		this.sioAcceptanceDate = sioAcceptanceDate;
		this.commitDate = commitDate;
		this.multiBuild = multiBuild;
		this.searchType = searchType;
		this.country = country;
		this.switchdd = switchdd;
		this.search_no = search_no;
		this.quantity = quantity;
		this.radio_button_value=radio_button_value;
		this.auto_look_up=auto_look_up;
		this.exact=exact;
	}
	public String getRequestNumber() {
		return requestNumber;
	}
	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getBulkAccessNoWorkflow() {
		return bulkAccessNoWorkflow;
	}
	public void setBulkAccessNoWorkflow(String bulkAccessNoWorkflow) {
		this.bulkAccessNoWorkflow = bulkAccessNoWorkflow;
	}
	public Date getSioAcceptanceDate() {
		return sioAcceptanceDate;
	}
	public void setSioAcceptanceDate(Date sioAcceptanceDate) {
		this.sioAcceptanceDate = sioAcceptanceDate;
	}
	public Date getCommitDate() {
		return commitDate;
	}
	public void setCommitDate(Date commitDate) {
		this.commitDate = commitDate;
	}
	public page1() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPresentStage() {
		return presentStage;
	}
	public void setPresentStage(String presentStage) {
		this.presentStage = presentStage;
	}
	public String getNumberStatus() {
		return numberStatus;
	}
	public void setNumberStatus(String numberStatus) {
		this.numberStatus = numberStatus;
	}
	public String getNumberAddressStatus() {
		return numberAddressStatus;
	}
	public void setNumberAddressStatus(String numberAddressStatus) {
		this.numberAddressStatus = numberAddressStatus;
	}
	public String getErrorNotes() {
		return errorNotes;
	}
	public void setErrorNotes(String errorNotes) {
		this.errorNotes = errorNotes;
	}
	
	
}
