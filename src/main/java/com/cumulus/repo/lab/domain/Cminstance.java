package com.cumulus.repo.lab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * A Cminstance.
 */
@Entity
@Table(name = "T_CMINSTANCE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Cminstance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "modelid")
    private String modelid;

    @Column(name = "templateid")
    private String templateid;

    @Column(name = "xml")
    private String xml;

    @Column(name = "version", precision=10, scale=2)
    private BigDecimal version;

    @Column(name = "master")
    private Boolean master;

    @Column(name = "template_version", precision=10, scale=2)
    private BigDecimal templateversion;

    @Column(name = "status")
    private String status;

    @ManyToOne
    private Ca ca;

    @ManyToOne
    private Toc toc;

    @ManyToOne
    private Property property;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public BigDecimal getTemplateersion() {
        return templateversion;
    }

    public void setTemplateersion(BigDecimal templateversion) {
        this.templateversion = templateversion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Ca getCa() {
        return ca;
    }

    public void setCa(Ca ca) {
        this.ca = ca;
    }

    public Toc getToc() {
        return toc;
    }

    public void setToc(Toc toc) {
        this.toc = toc;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cminstance cminstance = (Cminstance) o;

        if (id != null ? !id.equals(cminstance.id) : cminstance.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Cminstance{" +
                "id=" + id +
                ", modelid='" + modelid + "'" +
                ", templateid='" + templateid + "'" +
                ", xml='" + xml + "'" +
                ", version='" + version + "'" +
                ", master='" + master + "'" +
                ", templateversion='" + templateversion + "'" +
                ", status='" + status + "'" +
                '}';
    }
}
