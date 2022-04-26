package dlt.dltbackendmaster.domain.watermelondb;

import java.util.Date;

public class BeneficiaryInterventionSyncModel
{
    private Integer beneficiary_id;
    private Integer subService_id;
    private String result;
    private Date date;
    private Integer us_id;
    private Integer activist_id;
    private Integer entryPoint;
    private String provider;
    private String remarks;
    private Integer status;
    private String _status;
    private String _changed;
    private Integer online_id;

    public BeneficiaryInterventionSyncModel() {}

    public Integer getBeneficiary_id() {
        return beneficiary_id;
    }

    public void setBeneficiary_id(Integer beneficiary_id) {
        this.beneficiary_id = beneficiary_id;
    }

    public Integer getSubService_id() {
        return subService_id;
    }

    public void setSubService_id(Integer subService_id) {
        this.subService_id = subService_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUs_id() {
        return us_id;
    }

    public void setUs_id(Integer us_id) {
        this.us_id = us_id;
    }

    public Integer getActivist_id() {
        return activist_id;
    }

    public void setActivist_id(Integer activist_id) {
        this.activist_id = activist_id;
    }

    public Integer getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(Integer entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String get_changed() {
        return _changed;
    }

    public void set_changed(String _changed) {
        this._changed = _changed;
    }

    public Integer getOnline_id() {
        return online_id;
    }

    public void setOnline_id(Integer online_id) {
        this.online_id = online_id;
    }
}
