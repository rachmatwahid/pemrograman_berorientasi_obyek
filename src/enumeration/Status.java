package enumeration;

enum Status {
    REGISTERED,
    ACTIVE,
    LEAVE,
    DROPOUT;

    public String statusInfo() {
        switch (this) {
            case REGISTERED: case ACTIVE:
                return "Active";
            case LEAVE: case DROPOUT:
                return "Inactive";
            default:
                return "Status Unavailable";
        }
    }
}
