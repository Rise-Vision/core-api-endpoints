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
 * Model definition for ScheduleWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScheduleWrapper extends com.google.api.client.json.GenericJson {

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
  private java.util.List<ScheduleItemWrapper> content;

  static {
    // hack to force ProGuard to consider ScheduleItemWrapper used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(ScheduleItemWrapper.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime creationDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean distributeToAll;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> distribution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> presentationIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recurrenceAbsolute;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceDayOfMonth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceDayOfWeek;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> recurrenceDaysOfWeek;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceFrequency;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceMonthOfYear;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recurrenceType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceWeekOfMonth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean timeDefined;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getChangeDate() {
    return changeDate;
  }

  /**
   * @param changeDate changeDate or {@code null} for none
   */
  public ScheduleWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
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
  public ScheduleWrapper setChangedBy(java.lang.String changedBy) {
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
  public ScheduleWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ScheduleItemWrapper> getContent() {
    return content;
  }

  /**
   * @param content content or {@code null} for none
   */
  public ScheduleWrapper setContent(java.util.List<ScheduleItemWrapper> content) {
    this.content = content;
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
  public ScheduleWrapper setCreationDate(com.google.api.client.util.DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDistributeToAll() {
    return distributeToAll;
  }

  /**
   * @param distributeToAll distributeToAll or {@code null} for none
   */
  public ScheduleWrapper setDistributeToAll(java.lang.Boolean distributeToAll) {
    this.distributeToAll = distributeToAll;
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
  public ScheduleWrapper setDistribution(java.util.List<java.lang.String> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public ScheduleWrapper setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndTime() {
    return endTime;
  }

  /**
   * @param endTime endTime or {@code null} for none
   */
  public ScheduleWrapper setEndTime(com.google.api.client.util.DateTime endTime) {
    this.endTime = endTime;
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
  public ScheduleWrapper setId(java.lang.String id) {
    this.id = id;
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
  public ScheduleWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPresentationIds() {
    return presentationIds;
  }

  /**
   * @param presentationIds presentationIds or {@code null} for none
   */
  public ScheduleWrapper setPresentationIds(java.util.List<java.lang.String> presentationIds) {
    this.presentationIds = presentationIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecurrenceAbsolute() {
    return recurrenceAbsolute;
  }

  /**
   * @param recurrenceAbsolute recurrenceAbsolute or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceAbsolute(java.lang.Boolean recurrenceAbsolute) {
    this.recurrenceAbsolute = recurrenceAbsolute;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceDayOfMonth() {
    return recurrenceDayOfMonth;
  }

  /**
   * @param recurrenceDayOfMonth recurrenceDayOfMonth or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
    this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceDayOfWeek() {
    return recurrenceDayOfWeek;
  }

  /**
   * @param recurrenceDayOfWeek recurrenceDayOfWeek or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceDayOfWeek(java.lang.Integer recurrenceDayOfWeek) {
    this.recurrenceDayOfWeek = recurrenceDayOfWeek;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRecurrenceDaysOfWeek() {
    return recurrenceDaysOfWeek;
  }

  /**
   * @param recurrenceDaysOfWeek recurrenceDaysOfWeek or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceDaysOfWeek(java.util.List<java.lang.String> recurrenceDaysOfWeek) {
    this.recurrenceDaysOfWeek = recurrenceDaysOfWeek;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceFrequency() {
    return recurrenceFrequency;
  }

  /**
   * @param recurrenceFrequency recurrenceFrequency or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceFrequency(java.lang.Integer recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceMonthOfYear() {
    return recurrenceMonthOfYear;
  }

  /**
   * @param recurrenceMonthOfYear recurrenceMonthOfYear or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceMonthOfYear(java.lang.Integer recurrenceMonthOfYear) {
    this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRecurrenceType() {
    return recurrenceType;
  }

  /**
   * @param recurrenceType recurrenceType or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceType(java.lang.String recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceWeekOfMonth() {
    return recurrenceWeekOfMonth;
  }

  /**
   * @param recurrenceWeekOfMonth recurrenceWeekOfMonth or {@code null} for none
   */
  public ScheduleWrapper setRecurrenceWeekOfMonth(java.lang.Integer recurrenceWeekOfMonth) {
    this.recurrenceWeekOfMonth = recurrenceWeekOfMonth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public ScheduleWrapper setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartTime() {
    return startTime;
  }

  /**
   * @param startTime startTime or {@code null} for none
   */
  public ScheduleWrapper setStartTime(com.google.api.client.util.DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTimeDefined() {
    return timeDefined;
  }

  /**
   * @param timeDefined timeDefined or {@code null} for none
   */
  public ScheduleWrapper setTimeDefined(java.lang.Boolean timeDefined) {
    this.timeDefined = timeDefined;
    return this;
  }

  @Override
  public ScheduleWrapper set(String fieldName, Object value) {
    return (ScheduleWrapper) super.set(fieldName, value);
  }

  @Override
  public ScheduleWrapper clone() {
    return (ScheduleWrapper) super.clone();
  }

}
