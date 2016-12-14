package org.sang;

/**
 * Created by sang on 16-12-14.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
