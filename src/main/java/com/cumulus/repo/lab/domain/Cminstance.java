package com.cumulus.repo.lab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
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

    @ManyToOne
    private Ca ca;

    @ManyToOne
    private Toc toc;

    @ManyToOne
    private Property property;

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
                '}';
    }
}
