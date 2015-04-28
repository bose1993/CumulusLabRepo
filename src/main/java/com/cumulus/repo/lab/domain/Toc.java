package com.cumulus.repo.lab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Toc.
 */
@Entity
@Table(name = "T_TOC")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Toc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cloudlayer")
    private String cloudlayer;

    @Column(name = "concretetoc")
    private String concretetoc;

    @Column(name = "tocdescription")
    private String tocdescription;

    @Column(name = "tocuri")
    private String tocuri;

    @Column(name = "toc_id")
    private String tocid;

    @OneToMany(mappedBy = "toc")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Cminstance> cminstances = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCloudlayer() {
        return cloudlayer;
    }

    public void setCloudlayer(String cloudlayer) {
        this.cloudlayer = cloudlayer;
    }

    public String getConcretetoc() {
        return concretetoc;
    }

    public void setConcretetoc(String concretetoc) {
        this.concretetoc = concretetoc;
    }

    public String getTocdescription() {
        return tocdescription;
    }

    public void setTocdescription(String tocdescription) {
        this.tocdescription = tocdescription;
    }

    public String getTocuri() {
        return tocuri;
    }

    public void setTocuri(String tocuri) {
        this.tocuri = tocuri;
    }

    public String getTocId() {
        return tocid;
    }

    public void setTocId(String tocid) {
        this.tocid = tocid;
    }

    public Set<Cminstance> getCminstances() {
        return cminstances;
    }

    public void setCminstances(Set<Cminstance> cminstances) {
        this.cminstances = cminstances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Toc toc = (Toc) o;

        if (id != null ? !id.equals(toc.id) : toc.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Toc{" +
                "id=" + id +
                ", cloudlayer='" + cloudlayer + "'" +
                ", concretetoc='" + concretetoc + "'" +
                ", tocdescription='" + tocdescription + "'" +
                ", tocuri='" + tocuri + "'" +
                ", tocid='" + tocid + "'" +
                '}';
    }
}
