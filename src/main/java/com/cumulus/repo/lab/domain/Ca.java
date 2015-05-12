package com.cumulus.repo.lab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Ca.
 */
@Entity
@Table(name = "T_CA")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Ca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uri")
    private String uri;

    @Column(name = "lab_user")
    private String labuser;
    
    @JsonIgnore
    @Column(name = "lab_secret")
    private String labsecret;

    @OneToMany(mappedBy = "ca")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Cminstance> cminstances = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabUser() {
        return labuser;
    }

    public void setLabUser(String labuser) {
        this.labuser = labuser;
    }
    
    @JsonIgnore
    public String getLabSecret() {
        return labsecret;
    }

    public void setLabSecret(String labsecret) {
        this.labsecret = labsecret;
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

        Ca ca = (Ca) o;

        if (id != null ? !id.equals(ca.id) : ca.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Ca{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", uri='" + uri + "'" +
                ", labuser='" + labuser + "'" +
                ", labsecret='" + labsecret + "'" +
                '}';
    }
}
