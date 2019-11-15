/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchPipelineVm;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchPipelineVmRecord extends UpdatableRecordImpl<TDispatchPipelineVmRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 1899157425;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.PIPELINE_ID</code>.
     */
    public TDispatchPipelineVmRecord setPipelineId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.VM_NAMES</code>.
     */
    public TDispatchPipelineVmRecord setVmNames(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.VM_NAMES</code>.
     */
    public String getVmNames() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.VM_SEQ_ID</code>.
     */
    public TDispatchPipelineVmRecord setVmSeqId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_PIPELINE_VM.VM_SEQ_ID</code>.
     */
    public Integer getVmSeqId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TDispatchPipelineVm.T_DISPATCH_PIPELINE_VM.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDispatchPipelineVm.T_DISPATCH_PIPELINE_VM.VM_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TDispatchPipelineVm.T_DISPATCH_PIPELINE_VM.VM_SEQ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVmNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVmSeqId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineVmRecord value1(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineVmRecord value2(String value) {
        setVmNames(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineVmRecord value3(Integer value) {
        setVmSeqId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchPipelineVmRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchPipelineVmRecord
     */
    public TDispatchPipelineVmRecord() {
        super(TDispatchPipelineVm.T_DISPATCH_PIPELINE_VM);
    }

    /**
     * Create a detached, initialised TDispatchPipelineVmRecord
     */
    public TDispatchPipelineVmRecord(String pipelineId, String vmNames, Integer vmSeqId) {
        super(TDispatchPipelineVm.T_DISPATCH_PIPELINE_VM);

        set(0, pipelineId);
        set(1, vmNames);
        set(2, vmSeqId);
    }
}