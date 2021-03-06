/*
 * This file is generated by jOOQ.
*/
package cricketScorer.db.gen.tables.records;


import cricketScorer.db.gen.tables.Players;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PlayersRecord extends TableRecordImpl<PlayersRecord> implements Record3<UUID, String, String> {

    private static final long serialVersionUID = 340233401;

    /**
     * Setter for <code>public.PLAYERS.ID</code>.
     */
    public PlayersRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.PLAYERS.ID</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.PLAYERS.NAME</code>.
     */
    public PlayersRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.PLAYERS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.PLAYERS.TEAM_NAME</code>.
     */
    public PlayersRecord setTeamName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.PLAYERS.TEAM_NAME</code>.
     */
    public String getTeamName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UUID, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Players.PLAYERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Players.PLAYERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Players.PLAYERS.TEAM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTeamName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayersRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayersRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayersRecord value3(String value) {
        setTeamName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlayersRecord values(UUID value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayersRecord
     */
    public PlayersRecord() {
        super(Players.PLAYERS);
    }

    /**
     * Create a detached, initialised PlayersRecord
     */
    public PlayersRecord(UUID id, String name, String teamName) {
        super(Players.PLAYERS);

        set(0, id);
        set(1, name);
        set(2, teamName);
    }
}
