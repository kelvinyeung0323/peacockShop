package com.peacock.shop.web.domain;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer userId;

    private String email;

    private String userName;

    private String password;

    private String question;

    private String answer;

    private Boolean sex;

    private Date birthday;

    private BigDecimal userMoney;

    private BigDecimal frozenMoney;

    private Integer payPoints;

    private Integer rankPoints;

    private Integer addressId;

    private Integer regTime;

    private Integer lastLogin;

    private Date lastTime;

    private String lastIp;

    private Short visitCount;

    private Byte userRank;

    private Byte isSpecial;

    private String ecSalt;

    private String salt;

    private Integer parentId;

    private Byte flag;

    private String alias;

    private String msn;

    private String qq;

    private String officePhone;

    private String homePhone;

    private String mobilePhone;

    private Byte isValidated;

    private BigDecimal creditLine;

    private String passwdQuestion;

    private String passwdAnswer;

    public User(Integer userId, String email, String userName, String password, String question, String answer, Boolean sex, Date birthday, BigDecimal userMoney, BigDecimal frozenMoney, Integer payPoints, Integer rankPoints, Integer addressId, Integer regTime, Integer lastLogin, Date lastTime, String lastIp, Short visitCount, Byte userRank, Byte isSpecial, String ecSalt, String salt, Integer parentId, Byte flag, String alias, String msn, String qq, String officePhone, String homePhone, String mobilePhone, Byte isValidated, BigDecimal creditLine, String passwdQuestion, String passwdAnswer) {
        this.userId = userId;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.question = question;
        this.answer = answer;
        this.sex = sex;
        this.birthday = birthday;
        this.userMoney = userMoney;
        this.frozenMoney = frozenMoney;
        this.payPoints = payPoints;
        this.rankPoints = rankPoints;
        this.addressId = addressId;
        this.regTime = regTime;
        this.lastLogin = lastLogin;
        this.lastTime = lastTime;
        this.lastIp = lastIp;
        this.visitCount = visitCount;
        this.userRank = userRank;
        this.isSpecial = isSpecial;
        this.ecSalt = ecSalt;
        this.salt = salt;
        this.parentId = parentId;
        this.flag = flag;
        this.alias = alias;
        this.msn = msn;
        this.qq = qq;
        this.officePhone = officePhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.isValidated = isValidated;
        this.creditLine = creditLine;
        this.passwdQuestion = passwdQuestion;
        this.passwdAnswer = passwdAnswer;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(Integer rankPoints) {
        this.rankPoints = rankPoints;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Short getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Short visitCount) {
        this.visitCount = visitCount;
    }

    public Byte getUserRank() {
        return userRank;
    }

    public void setUserRank(Byte userRank) {
        this.userRank = userRank;
    }

    public Byte getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Byte isSpecial) {
        this.isSpecial = isSpecial;
    }

    public String getEcSalt() {
        return ecSalt;
    }

    public void setEcSalt(String ecSalt) {
        this.ecSalt = ecSalt == null ? null : ecSalt.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone == null ? null : homePhone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Byte getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Byte isValidated) {
        this.isValidated = isValidated;
    }

    public BigDecimal getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    public String getPasswdQuestion() {
        return passwdQuestion;
    }

    public void setPasswdQuestion(String passwdQuestion) {
        this.passwdQuestion = passwdQuestion == null ? null : passwdQuestion.trim();
    }

    public String getPasswdAnswer() {
        return passwdAnswer;
    }

    public void setPasswdAnswer(String passwdAnswer) {
        this.passwdAnswer = passwdAnswer == null ? null : passwdAnswer.trim();
    }
}