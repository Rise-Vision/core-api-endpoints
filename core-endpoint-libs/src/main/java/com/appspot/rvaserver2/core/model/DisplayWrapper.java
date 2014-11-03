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
 * on 2014-11-03 at 22:05:18 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.core.model;

/**
 * Model definition for DisplayWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API (experimental). For a detailed
 * explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisplayWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressDescription;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer browserUpgradeMode;

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
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime creationDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean monitoringEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String province;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restartEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restartTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String street;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeZoneOffset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useCompanyAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressDescription() {
    return addressDescription;
  }

  /**
   * @param addressDescription addressDescription or {@code null} for none
   */
  public DisplayWrapper setAddressDescription(java.lang.String addressDescription) {
    this.addressDescription = addressDescription;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBrowserUpgradeMode() {
    return browserUpgradeMode;
  }

  /**
   * @param browserUpgradeMode browserUpgradeMode or {@code null} for none
   */
  public DisplayWrapper setBrowserUpgradeMode(java.lang.Integer browserUpgradeMode) {
    this.browserUpgradeMode = browserUpgradeMode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getChangeDate() {
    return changeDate;
  }

  /**
   * @param changeDate changeDate or {@code null} for none
   */
  public DisplayWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
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
  public DisplayWrapper setChangedBy(java.lang.String changedBy) {
    this.changedBy = changedBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public DisplayWrapper setCity(java.lang.String city) {
    this.city = city;
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
  public DisplayWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * @param country country or {@code null} for none
   */
  public DisplayWrapper setCountry(java.lang.String country) {
    this.country = country;
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
  public DisplayWrapper setCreationDate(com.google.api.client.util.DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * @param height height or {@code null} for none
   */
  public DisplayWrapper setHeight(java.lang.Integer height) {
    this.height = height;
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
  public DisplayWrapper setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * @param latitude latitude or {@code null} for none
   */
  public DisplayWrapper setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * @param longitude longitude or {@code null} for none
   */
  public DisplayWrapper setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMonitoringEnabled() {
    return monitoringEnabled;
  }

  /**
   * @param monitoringEnabled monitoringEnabled or {@code null} for none
   */
  public DisplayWrapper setMonitoringEnabled(java.lang.Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public DisplayWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * @param postalCode postalCode or {@code null} for none
   */
  public DisplayWrapper setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProvince() {
    return province;
  }

  /**
   * @param province province or {@code null} for none
   */
  public DisplayWrapper setProvince(java.lang.String province) {
    this.province = province;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestartEnabled() {
    return restartEnabled;
  }

  /**
   * @param restartEnabled restartEnabled or {@code null} for none
   */
  public DisplayWrapper setRestartEnabled(java.lang.Boolean restartEnabled) {
    this.restartEnabled = restartEnabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRestartTime() {
    return restartTime;
  }

  /**
   * @param restartTime restartTime or {@code null} for none
   */
  public DisplayWrapper setRestartTime(java.lang.String restartTime) {
    this.restartTime = restartTime;
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
  public DisplayWrapper setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStreet() {
    return street;
  }

  /**
   * @param street street or {@code null} for none
   */
  public DisplayWrapper setStreet(java.lang.String street) {
    this.street = street;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  /**
   * @param timeZoneOffset timeZoneOffset or {@code null} for none
   */
  public DisplayWrapper setTimeZoneOffset(java.lang.Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * @param unit unit or {@code null} for none
   */
  public DisplayWrapper setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseCompanyAddress() {
    return useCompanyAddress;
  }

  /**
   * @param useCompanyAddress useCompanyAddress or {@code null} for none
   */
  public DisplayWrapper setUseCompanyAddress(java.lang.Boolean useCompanyAddress) {
    this.useCompanyAddress = useCompanyAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * @param width width or {@code null} for none
   */
  public DisplayWrapper setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public DisplayWrapper set(String fieldName, Object value) {
    return (DisplayWrapper) super.set(fieldName, value);
  }

  @Override
  public DisplayWrapper clone() {
    return (DisplayWrapper) super.clone();
  }

}