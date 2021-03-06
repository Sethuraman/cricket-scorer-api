/*
 * This file is generated by jOOQ.
*/
package cricketScorer.db.gen.tables.records;


import cricketScorer.db.gen.tables.Game;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class GameRecord extends TableRecordImpl<GameRecord> implements Record5<UUID, String, String, Timestamp, String> {

    private static final long serialVersionUID = 1727009241;

    /**
     * Setter for <code>public.GAME.ID</code>.
     */
    public GameRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.GAME.ID</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.GAME.TEAM1</code>.
     */
    public GameRecord setTeam1(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.GAME.TEAM1</code>.
     */
    public String getTeam1() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.GAME.TEAM2</code>.
     */
    public GameRecord setTeam2(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.GAME.TEAM2</code>.
     */
    public String getTeam2() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.GAME.GAME_START_TIME</code>.
     */
    public GameRecord setGameStartTime(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.GAME.GAME_START_TIME</code>.
     */
    public Timestamp getGameStartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.GAME.GAME_TYPE</code>.
     */
    public GameRecord setGameType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.GAME.GAME_TYPE</code>.
     */
    public String getGameType() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, String, String, Timestamp, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, String, String, Timestamp, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Game.GAME.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Game.GAME.TEAM1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Game.GAME.TEAM2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Game.GAME.GAME_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Game.GAME.GAME_TYPE;
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
        return getTeam1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTeam2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getGameStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGameType();
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
        return getTeam1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTeam2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getGameStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGameType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord value2(String value) {
        setTeam1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord value3(String value) {
        setTeam2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord value4(Timestamp value) {
        setGameStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord value5(String value) {
        setGameType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameRecord values(UUID value1, String value2, String value3, Timestamp value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GameRecord
     */
    public GameRecord() {
        super(Game.GAME);
    }

    /**
     * Create a detached, initialised GameRecord
     */
    public GameRecord(UUID id, String team1, String team2, Timestamp gameStartTime, String gameType) {
        super(Game.GAME);

        set(0, id);
        set(1, team1);
        set(2, team2);
        set(3, gameStartTime);
        set(4, gameType);
    }
}
