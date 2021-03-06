/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-11-11 at 21:50:12 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.rise.model;

/**
 * Model definition for UserWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API (for internal use only). For a detailed
 * explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime changeDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changedBy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime creationDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastLogin;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mailSyncEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> roles;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean showTutorial;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telephone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime termsAcceptanceDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getChangeDate() {
    return changeDate;
  }

  /**
   * @param changeDate changeDate or {@code null} for none
   */
  public UserWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getChangedBy() {
    return changedBy;
  }

  /**
   * @param changedBy changedBy or {@code null} for none
   */
  public UserWrapper setChangedBy(java.lang.String changedBy) {
    this.changedBy = changedBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanyId() {
    return companyId;
  }

  /**
   * @param companyId companyId or {@code null} for none
   */
  public UserWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreationDate() {
    return creationDate;
  }

  /**
   * @param creationDate creationDate or {@code null} for none
   */
  public UserWrapper setCreationDate(com.google.api.client.util.DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * @param customerId customerId or {@code null} for none
   */
  public UserWrapper setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public UserWrapper setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName firstName or {@code null} for none
   */
  public UserWrapper setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public UserWrapper setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastLogin() {
    return lastLogin;
  }

  /**
   * @param lastLogin lastLogin or {@code null} for none
   */
  public UserWrapper setLastLogin(com.google.api.client.util.DateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastName() {
    return lastName;
  }

  /**
   * @param lastName lastName or {@code null} for none
   */
  public UserWrapper setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMailSyncEnabled() {
    return mailSyncEnabled;
  }

  /**
   * @param mailSyncEnabled mailSyncEnabled or {@code null} for none
   */
  public UserWrapper setMailSyncEnabled(java.lang.Boolean mailSyncEnabled) {
    this.mailSyncEnabled = mailSyncEnabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRoles() {
    return roles;
  }

  /**
   * @param roles roles or {@code null} for none
   */
  public UserWrapper setRoles(java.util.List<java.lang.String> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShowTutorial() {
    return showTutorial;
  }

  /**
   * @param showTutorial showTutorial or {@code null} for none
   */
  public UserWrapper setShowTutorial(java.lang.Boolean showTutorial) {
    this.showTutorial = showTutorial;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public UserWrapper setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone telephone or {@code null} for none
   */
  public UserWrapper setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTermsAcceptanceDate() {
    return termsAcceptanceDate;
  }

  /**
   * @param termsAcceptanceDate termsAcceptanceDate or {@code null} for none
   */
  public UserWrapper setTermsAcceptanceDate(com.google.api.client.util.DateTime termsAcceptanceDate) {
    this.termsAcceptanceDate = termsAcceptanceDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * @param username username or {@code null} for none
   */
  public UserWrapper setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public UserWrapper set(String fieldName, Object value) {
    return (UserWrapper) super.set(fieldName, value);
  }

  @Override
  public UserWrapper clone() {
    return (UserWrapper) super.clone();
  }

}
