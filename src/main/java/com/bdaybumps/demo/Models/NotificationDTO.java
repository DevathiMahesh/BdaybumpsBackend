package com.bdaybumps.demo.Models;

import org.apache.kafka.common.protocol.types.Field;

public class NotificationDTO {
      private String Title;
      private String Description;
      NotificationDTO()
      {

      }
      NotificationDTO(String Title,String Description)
      {
          this.Title = Title;
          this.Description = Description;
      }
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "NotificationDTO{" +
                "title='" + Title + '\'' +
                ", description='" + Description + '\'' +
                '}';
    }
}
