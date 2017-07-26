package edu.cnm.bootcamp.kelly.authormate.entitites;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * Created by kelly on 7/26/17.
 */

@DatabaseTable(tableName = "PROJECTUPDATE")
public class ProjectUpdate {

  @DatabaseField(columnName = "PROJECT_ID", canBeNull = false, foreign = true)
  private Project project;

  @DatabaseField(columnName = "CREATED", readOnly = true)
  private Timestamp created;

  @DatabaseField(columnName = "COUNT", canBeNull = false)
  private Integer count;

  @DatabaseField(columnName = "NOTES")
  private Clob notes;

  public ProjectUpdate() {
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Timestamp getCreated() {
    return created;
  }


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Clob getNotes() {
    return notes;
  }

  public void setNotes(Clob notes) {
    this.notes = notes;
  }
}
