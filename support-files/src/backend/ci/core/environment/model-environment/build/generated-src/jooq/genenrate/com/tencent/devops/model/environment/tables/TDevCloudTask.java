/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.environment.tables;


import com.tencent.devops.model.environment.DevopsEnvironment;
import com.tencent.devops.model.environment.Keys;
import com.tencent.devops.model.environment.tables.records.TDevCloudTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDevCloudTask extends TableImpl<TDevCloudTaskRecord> {

    private static final long serialVersionUID = -646459902;

    /**
     * The reference instance of <code>devops_environment.T_DEV_CLOUD_TASK</code>
     */
    public static final TDevCloudTask T_DEV_CLOUD_TASK = new TDevCloudTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDevCloudTaskRecord> getRecordType() {
        return TDevCloudTaskRecord.class;
    }

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.TASK_ID</code>. ID
     */
    public final TableField<TDevCloudTaskRecord, Long> TASK_ID = createField("TASK_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "ID");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.PROJECT_ID</code>. 项目ID
     */
    public final TableField<TDevCloudTaskRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "项目ID");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.OPERATOR</code>.
     */
    public final TableField<TDevCloudTaskRecord, String> OPERATOR = createField("OPERATOR", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.ACTION</code>.
     */
    public final TableField<TDevCloudTaskRecord, String> ACTION = createField("ACTION", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.STATUS</code>.
     */
    public final TableField<TDevCloudTaskRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.REGISTRY_HOST</code>. 仓库地址
     */
    public final TableField<TDevCloudTaskRecord, String> REGISTRY_HOST = createField("REGISTRY_HOST", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "仓库地址");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.REGISTRY_USER</code>. 仓库用户名
     */
    public final TableField<TDevCloudTaskRecord, String> REGISTRY_USER = createField("REGISTRY_USER", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "仓库用户名");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.REGISTRY_PWD</code>. 仓库密码
     */
    public final TableField<TDevCloudTaskRecord, String> REGISTRY_PWD = createField("REGISTRY_PWD", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "仓库密码");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.CONTAINER_NAME</code>. 容器名称
     */
    public final TableField<TDevCloudTaskRecord, String> CONTAINER_NAME = createField("CONTAINER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "容器名称");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.CONTAINER_TYPE</code>. 容器类型
     */
    public final TableField<TDevCloudTaskRecord, String> CONTAINER_TYPE = createField("CONTAINER_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "容器类型");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.IMAGE</code>. 镜像
     */
    public final TableField<TDevCloudTaskRecord, String> IMAGE = createField("IMAGE", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "镜像");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.CPU</code>. 容器cpu核数
     */
    public final TableField<TDevCloudTaskRecord, Integer> CPU = createField("CPU", org.jooq.impl.SQLDataType.INTEGER, this, "容器cpu核数");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.MEMORY</code>. 容器内存大小
     */
    public final TableField<TDevCloudTaskRecord, String> MEMORY = createField("MEMORY", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "容器内存大小");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.DISK</code>. 容器磁盘大小
     */
    public final TableField<TDevCloudTaskRecord, String> DISK = createField("DISK", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "容器磁盘大小");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.REPLICA</code>. 容器副本数
     */
    public final TableField<TDevCloudTaskRecord, Integer> REPLICA = createField("REPLICA", org.jooq.impl.SQLDataType.INTEGER, this, "容器副本数");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.PASSWORD</code>. 容器密码
     */
    public final TableField<TDevCloudTaskRecord, String> PASSWORD = createField("PASSWORD", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "容器密码");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.CREATED_TIME</code>.
     */
    public final TableField<TDevCloudTaskRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.UPDATE_TIME</code>.
     */
    public final TableField<TDevCloudTaskRecord, LocalDateTime> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.DEV_CLOUD_TASK_ID</code>. devCloud的任务Id
     */
    public final TableField<TDevCloudTaskRecord, String> DEV_CLOUD_TASK_ID = createField("DEV_CLOUD_TASK_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "devCloud的任务Id");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.NODE_LONG_ID</code>. nodeId
     */
    public final TableField<TDevCloudTaskRecord, Long> NODE_LONG_ID = createField("NODE_LONG_ID", org.jooq.impl.SQLDataType.BIGINT, this, "nodeId");

    /**
     * The column <code>devops_environment.T_DEV_CLOUD_TASK.DESCRIPTION</code>.
     */
    public final TableField<TDevCloudTaskRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>devops_environment.T_DEV_CLOUD_TASK</code> table reference
     */
    public TDevCloudTask() {
        this("T_DEV_CLOUD_TASK", null);
    }

    /**
     * Create an aliased <code>devops_environment.T_DEV_CLOUD_TASK</code> table reference
     */
    public TDevCloudTask(String alias) {
        this(alias, T_DEV_CLOUD_TASK);
    }

    private TDevCloudTask(String alias, Table<TDevCloudTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDevCloudTask(String alias, Table<TDevCloudTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsEnvironment.DEVOPS_ENVIRONMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TDevCloudTaskRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_DEV_CLOUD_TASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDevCloudTaskRecord> getPrimaryKey() {
        return Keys.KEY_T_DEV_CLOUD_TASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDevCloudTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TDevCloudTaskRecord>>asList(Keys.KEY_T_DEV_CLOUD_TASK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDevCloudTask as(String alias) {
        return new TDevCloudTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDevCloudTask rename(String name) {
        return new TDevCloudTask(name, null);
    }
}