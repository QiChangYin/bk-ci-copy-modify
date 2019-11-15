/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.notify.tables.records;


import com.tencent.devops.model.notify.tables.TCommonNotifyMessageTemplate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCommonNotifyMessageTemplateRecord extends UpdatableRecordImpl<TCommonNotifyMessageTemplateRecord> implements Record6<String, String, String, String, Byte, Byte> {

    private static final long serialVersionUID = -208359463;

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.ID</code>.
     */
    public TCommonNotifyMessageTemplateRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_CODE</code>.
     */
    public TCommonNotifyMessageTemplateRecord setTemplateCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_CODE</code>.
     */
    public String getTemplateCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_NAME</code>.
     */
    public TCommonNotifyMessageTemplateRecord setTemplateName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_NAME</code>.
     */
    public String getTemplateName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.NOTIFY_TYPE_SCOPE</code>.
     */
    public TCommonNotifyMessageTemplateRecord setNotifyTypeScope(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.NOTIFY_TYPE_SCOPE</code>.
     */
    public String getNotifyTypeScope() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.PRIORITY</code>.
     */
    public TCommonNotifyMessageTemplateRecord setPriority(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.PRIORITY</code>.
     */
    public Byte getPriority() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.SOURCE</code>.
     */
    public TCommonNotifyMessageTemplateRecord setSource(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.SOURCE</code>.
     */
    public Byte getSource() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Byte, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Byte, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.NOTIFY_TYPE_SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTemplateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTemplateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNotifyTypeScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value2(String value) {
        setTemplateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value3(String value) {
        setTemplateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value4(String value) {
        setNotifyTypeScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value5(Byte value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord value6(Byte value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplateRecord values(String value1, String value2, String value3, String value4, Byte value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCommonNotifyMessageTemplateRecord
     */
    public TCommonNotifyMessageTemplateRecord() {
        super(TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE);
    }

    /**
     * Create a detached, initialised TCommonNotifyMessageTemplateRecord
     */
    public TCommonNotifyMessageTemplateRecord(String id, String templateCode, String templateName, String notifyTypeScope, Byte priority, Byte source) {
        super(TCommonNotifyMessageTemplate.T_COMMON_NOTIFY_MESSAGE_TEMPLATE);

        set(0, id);
        set(1, templateCode);
        set(2, templateName);
        set(3, notifyTypeScope);
        set(4, priority);
        set(5, source);
    }
}