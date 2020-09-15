/*
 * This file is generated by jOOQ.
*/
package aug.common.gateway.db.jooq.tables.records;


import aug.common.gateway.db.jooq.tables.GwRateLimit;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 限流配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GwRateLimitRecord extends UpdatableRecordImpl<GwRateLimitRecord> implements Record8<Integer, String, String, Long, Long, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1081400846;

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.service_code</code>.
     */
    public void setServiceCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.service_code</code>.
     */
    public String getServiceCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.limit_type</code>.
     */
    public void setLimitType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.limit_type</code>.
     */
    public String getLimitType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.limit_count</code>.
     */
    public void setLimitCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.limit_count</code>.
     */
    public Long getLimitCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.interval</code>.
     */
    public void setInterval(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.interval</code>.
     */
    public Long getInterval() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.time_unit</code>.
     */
    public void setTimeUnit(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.time_unit</code>.
     */
    public String getTimeUnit() {
        return (String) get(5);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>aug_gateway.gw_rate_limit.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>aug_gateway.gw_rate_limit.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Long, Long, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Long, Long, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GwRateLimit.GW_RATE_LIMIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GwRateLimit.GW_RATE_LIMIT.SERVICE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GwRateLimit.GW_RATE_LIMIT.LIMIT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return GwRateLimit.GW_RATE_LIMIT.LIMIT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return GwRateLimit.GW_RATE_LIMIT.INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GwRateLimit.GW_RATE_LIMIT.TIME_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return GwRateLimit.GW_RATE_LIMIT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return GwRateLimit.GW_RATE_LIMIT.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getServiceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLimitType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getLimitCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTimeUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getServiceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLimitType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLimitCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTimeUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value2(String value) {
        setServiceCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value3(String value) {
        setLimitType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value4(Long value) {
        setLimitCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value5(Long value) {
        setInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value6(String value) {
        setTimeUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value7(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord value8(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwRateLimitRecord values(Integer value1, String value2, String value3, Long value4, Long value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GwRateLimitRecord
     */
    public GwRateLimitRecord() {
        super(GwRateLimit.GW_RATE_LIMIT);
    }

    /**
     * Create a detached, initialised GwRateLimitRecord
     */
    public GwRateLimitRecord(Integer id, String serviceCode, String limitType, Long limitCount, Long interval, String timeUnit, Timestamp createdAt, Timestamp updatedAt) {
        super(GwRateLimit.GW_RATE_LIMIT);

        set(0, id);
        set(1, serviceCode);
        set(2, limitType);
        set(3, limitCount);
        set(4, interval);
        set(5, timeUnit);
        set(6, createdAt);
        set(7, updatedAt);
    }
}
