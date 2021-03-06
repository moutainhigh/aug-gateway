/*
 * This file is generated by jOOQ.
*/
package aug.common.gateway.db.jooq.tables;


import aug.common.gateway.db.jooq.AugGateway;
import aug.common.gateway.db.jooq.Indexes;
import aug.common.gateway.db.jooq.Keys;
import aug.common.gateway.db.jooq.tables.records.GwServiceRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 服务配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GwService extends TableImpl<GwServiceRecord> {

    private static final long serialVersionUID = -877962998;

    /**
     * The reference instance of <code>aug_gateway.gw_service</code>
     */
    public static final GwService GW_SERVICE = new GwService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GwServiceRecord> getRecordType() {
        return GwServiceRecord.class;
    }

    /**
     * The column <code>aug_gateway.gw_service.id</code>.
     */
    public final TableField<GwServiceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>aug_gateway.gw_service.service_code</code>.
     */
    public final TableField<GwServiceRecord, String> SERVICE_CODE = createField("service_code", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.service_num</code>.
     */
    public final TableField<GwServiceRecord, Integer> SERVICE_NUM = createField("service_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.service_name</code>.
     */
    public final TableField<GwServiceRecord, String> SERVICE_NAME = createField("service_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.host</code>.
     */
    public final TableField<GwServiceRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.port</code>.
     */
    public final TableField<GwServiceRecord, Integer> PORT = createField("port", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.status</code>.
     */
    public final TableField<GwServiceRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.created_at</code>.
     */
    public final TableField<GwServiceRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>aug_gateway.gw_service.updated_at</code>.
     */
    public final TableField<GwServiceRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>aug_gateway.gw_service</code> table reference
     */
    public GwService() {
        this(DSL.name("gw_service"), null);
    }

    /**
     * Create an aliased <code>aug_gateway.gw_service</code> table reference
     */
    public GwService(String alias) {
        this(DSL.name(alias), GW_SERVICE);
    }

    /**
     * Create an aliased <code>aug_gateway.gw_service</code> table reference
     */
    public GwService(Name alias) {
        this(alias, GW_SERVICE);
    }

    private GwService(Name alias, Table<GwServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private GwService(Name alias, Table<GwServiceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "服务配置表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return AugGateway.AUG_GATEWAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GW_SERVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GwServiceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GW_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GwServiceRecord> getPrimaryKey() {
        return Keys.KEY_GW_SERVICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GwServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<GwServiceRecord>>asList(Keys.KEY_GW_SERVICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwService as(String alias) {
        return new GwService(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GwService as(Name alias) {
        return new GwService(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GwService rename(String name) {
        return new GwService(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GwService rename(Name name) {
        return new GwService(name, null);
    }
}
