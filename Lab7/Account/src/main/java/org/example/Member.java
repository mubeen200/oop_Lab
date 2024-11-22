package org.example;

class Member {
    private String MemberName;
    private String MemberEmail;
    private String MemberContact;

    public Member(String MemberName, String MemberEmail, String MemberContact) {
        this.MemberName = MemberName;
        this.MemberEmail = MemberEmail;
        this.MemberContact = MemberContact;
    }

    public String getMemberName() {
        return MemberName;
    }

    public String getMemberEmail() {
        return MemberEmail;
    }

    public String getMemberContact() {
        return MemberContact;
    }
}
