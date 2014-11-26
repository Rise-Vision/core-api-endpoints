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
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2014-11-26 at 19:48:31 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.core.model;

/**
 * Model definition for AlertSettingsWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AlertSettingsWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedCategories;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedCertainties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedEventCodes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedHandlingCodes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedSenders;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedSeverities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedStatuses;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedUrgencies;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultExpiry;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> distribution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String presentationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> textFields;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedCategories() {
    return allowedCategories;
  }

  /**
   * @param allowedCategories allowedCategories or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedCategories(java.util.List<java.lang.String> allowedCategories) {
    this.allowedCategories = allowedCategories;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedCertainties() {
    return allowedCertainties;
  }

  /**
   * @param allowedCertainties allowedCertainties or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedCertainties(java.util.List<java.lang.String> allowedCertainties) {
    this.allowedCertainties = allowedCertainties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedEventCodes() {
    return allowedEventCodes;
  }

  /**
   * @param allowedEventCodes allowedEventCodes or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedEventCodes(java.util.List<java.lang.String> allowedEventCodes) {
    this.allowedEventCodes = allowedEventCodes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedHandlingCodes() {
    return allowedHandlingCodes;
  }

  /**
   * @param allowedHandlingCodes allowedHandlingCodes or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedHandlingCodes(java.util.List<java.lang.String> allowedHandlingCodes) {
    this.allowedHandlingCodes = allowedHandlingCodes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedSenders() {
    return allowedSenders;
  }

  /**
   * @param allowedSenders allowedSenders or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedSenders(java.util.List<java.lang.String> allowedSenders) {
    this.allowedSenders = allowedSenders;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedSeverities() {
    return allowedSeverities;
  }

  /**
   * @param allowedSeverities allowedSeverities or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedSeverities(java.util.List<java.lang.String> allowedSeverities) {
    this.allowedSeverities = allowedSeverities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedStatuses() {
    return allowedStatuses;
  }

  /**
   * @param allowedStatuses allowedStatuses or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedStatuses(java.util.List<java.lang.String> allowedStatuses) {
    this.allowedStatuses = allowedStatuses;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedUrgencies() {
    return allowedUrgencies;
  }

  /**
   * @param allowedUrgencies allowedUrgencies or {@code null} for none
   */
  public AlertSettingsWrapper setAllowedUrgencies(java.util.List<java.lang.String> allowedUrgencies) {
    this.allowedUrgencies = allowedUrgencies;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultExpiry() {
    return defaultExpiry;
  }

  /**
   * @param defaultExpiry defaultExpiry or {@code null} for none
   */
  public AlertSettingsWrapper setDefaultExpiry(java.lang.Integer defaultExpiry) {
    this.defaultExpiry = defaultExpiry;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDistribution() {
    return distribution;
  }

  /**
   * @param distribution distribution or {@code null} for none
   */
  public AlertSettingsWrapper setDistribution(java.util.List<java.lang.String> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * @param enabled enabled or {@code null} for none
   */
  public AlertSettingsWrapper setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * @param password password or {@code null} for none
   */
  public AlertSettingsWrapper setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPresentationId() {
    return presentationId;
  }

  /**
   * @param presentationId presentationId or {@code null} for none
   */
  public AlertSettingsWrapper setPresentationId(java.lang.String presentationId) {
    this.presentationId = presentationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTextFields() {
    return textFields;
  }

  /**
   * @param textFields textFields or {@code null} for none
   */
  public AlertSettingsWrapper setTextFields(java.util.List<java.lang.String> textFields) {
    this.textFields = textFields;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * @param userName userName or {@code null} for none
   */
  public AlertSettingsWrapper setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public AlertSettingsWrapper set(String fieldName, Object value) {
    return (AlertSettingsWrapper) super.set(fieldName, value);
  }

  @Override
  public AlertSettingsWrapper clone() {
    return (AlertSettingsWrapper) super.clone();
  }

}
