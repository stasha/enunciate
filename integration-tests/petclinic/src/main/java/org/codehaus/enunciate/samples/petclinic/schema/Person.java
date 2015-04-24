package org.codehaus.enunciate.samples.petclinic.schema;

import com.webcohesion.enunciate.metadata.qname.XmlQNameEnumRef;

import javax.xml.namespace.QName;
import java.net.URI;

/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Ken Krebs
 */
public class Person extends Entity {

  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String telephone;
  private QName favoriteFood;
  private QName favoriteColor;
  private QName education;
  private URI defenseTraining;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  @XmlQNameEnumRef(FavoriteFood.class)
  public QName getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(QName favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  @XmlQNameEnumRef(FavoriteColor.class)
  public QName getFavoriteColor() {
    return favoriteColor;
  }

  public void setFavoriteColor(QName favoriteColor) {
    this.favoriteColor = favoriteColor;
  }

  @XmlQNameEnumRef(Education.class)
  public QName getEducation() {
    return education;
  }

  public void setEducation(QName education) {
    this.education = education;
  }

  @XmlQNameEnumRef(DefenseTraining.class)
  public URI getDefenseTraining() {
    return defenseTraining;
  }

  public void setDefenseTraining(URI defenseTraining) {
    this.defenseTraining = defenseTraining;
  }
}
