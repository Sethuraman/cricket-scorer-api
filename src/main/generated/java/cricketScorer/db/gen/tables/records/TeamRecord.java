/*
 * This file is generated by jOOQ.
*/
package cricketScorer.db.gen.tables.records;


import cricketScorer.db.gen.tables.Team;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamRecord extends TableRecordImpl<TeamRecord> implements Record1<String> {

    private static final long serialVersionUID = -34095346;

    /**
     * Setter for <code>public.TEAM.TEAM_NAME</code>.
     */
    public TeamRecord setTeamName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.TEAM.TEAM_NAME</code>.
     */
    public String getTeamName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Team.TEAM.TEAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamRecord value1(String value) {
        setTeamName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TeamRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeamRecord
     */
    public TeamRecord() {
        super(Team.TEAM);
    }

    /**
     * Create a detached, initialised TeamRecord
     */
    public TeamRecord(String teamName) {
        super(Team.TEAM);

        set(0, teamName);
    }
}
