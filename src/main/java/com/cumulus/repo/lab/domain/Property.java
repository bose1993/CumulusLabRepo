package com.cumulus.repo.lab.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Property.
 */
@Entity
@Table(name = "T_PROPERTY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Property implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rules")
    private String rules;

    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "T_PROPERTY_PROPERTYATTRIBUTE",
               joinColumns = @JoinColumn(name="propertys_id", referencedColumnName="ID"),
               inverseJoinColumns = @JoinColumn(name="propertyattributes_id", referencedColumnName="ID"))
    private Set<Propertyattribute> propertyattributes = new HashSet<>();

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Cminstance> cminstances = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public Set<Propertyattribute> getPropertyattributes() {
        return propertyattributes;
    }

    public void setPropertyattributes(Set<Propertyattribute> propertyattributes) {
        this.propertyattributes = propertyattributes;
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

        Property property = (Property) o;

        if (id != null ? !id.equals(property.id) : property.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", rules='" + rules + "'" +
                '}';
    }
}
