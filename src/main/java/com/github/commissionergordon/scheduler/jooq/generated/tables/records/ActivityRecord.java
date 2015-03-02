/**
 * This class is generated by jOOQ
 */
package com.github.commissionergordon.scheduler.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.2"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActivityRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.commissionergordon.scheduler.jooq.generated.tables.records.ActivityRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Time, java.lang.Boolean, java.sql.Time, java.lang.Integer> {

	private static final long serialVersionUID = 710978834;

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.ACTIVITY_ID</code>.
	 */
	public void setActivityId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.ACTIVITY_ID</code>.
	 */
	public java.lang.Integer getActivityId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.USER_ID</code>.
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.USER_ID</code>.
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.DURATION</code>.
	 */
	public void setDuration(java.sql.Time value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.DURATION</code>.
	 */
	public java.sql.Time getDuration() {
		return (java.sql.Time) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.ENABLED</code>.
	 */
	public void setEnabled(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.ENABLED</code>.
	 */
	public java.lang.Boolean getEnabled() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.STARTTIME</code>.
	 */
	public void setStarttime(java.sql.Time value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.STARTTIME</code>.
	 */
	public java.sql.Time getStarttime() {
		return (java.sql.Time) getValue(5);
	}

	/**
	 * Setter for <code>PUBLIC.ACTIVITY.PRIORITY</code>.
	 */
	public void setPriority(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>PUBLIC.ACTIVITY.PRIORITY</code>.
	 */
	public java.lang.Integer getPriority() {
		return (java.lang.Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Time, java.lang.Boolean, java.sql.Time, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Time, java.lang.Boolean, java.sql.Time, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.ACTIVITY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field4() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field6() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.STARTTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY.PRIORITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getActivityId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value4() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value6() {
		return getStarttime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getPriority();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value1(java.lang.Integer value) {
		setActivityId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value2(java.lang.Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value3(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value4(java.sql.Time value) {
		setDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value5(java.lang.Boolean value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value6(java.sql.Time value) {
		setStarttime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value7(java.lang.Integer value) {
		setPriority(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.sql.Time value4, java.lang.Boolean value5, java.sql.Time value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActivityRecord
	 */
	public ActivityRecord() {
		super(com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY);
	}

	/**
	 * Create a detached, initialised ActivityRecord
	 */
	public ActivityRecord(java.lang.Integer activityId, java.lang.Integer userId, java.lang.String name, java.sql.Time duration, java.lang.Boolean enabled, java.sql.Time starttime, java.lang.Integer priority) {
		super(com.github.commissionergordon.scheduler.jooq.generated.tables.Activity.ACTIVITY);

		setValue(0, activityId);
		setValue(1, userId);
		setValue(2, name);
		setValue(3, duration);
		setValue(4, enabled);
		setValue(5, starttime);
		setValue(6, priority);
	}
}
