package org.apache.tapestry.unicorn.entities.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.tapestry.unicorn.entities.Entry;

/**
 * Class _License was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _License extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String ENTRIES_PROPERTY = "entries";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setId(Long id) {
        writeProperty("id", id);
    }
    public Long getId() {
        return (Long)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToEntries(Entry obj) {
        addToManyTarget("entries", obj, true);
    }
    public void removeFromEntries(Entry obj) {
        removeToManyTarget("entries", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Entry> getEntries() {
        return (List<Entry>)readProperty("entries");
    }


}