package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;
import java.util.Date;

public class GameEntity implements Serializable {
    private String id;

    private String video;

    private String apk;

    private Integer downloadNum;

    private String itunesId;

    private String compatibility;

    private String versionChild;

    private Long gameSize;

    private String releaseImage;

    private String name;

    private String coverImage;

    private Integer imageRatio;

    private String icon;

    private Date editedAt;

    private String communityId;

    private String memberId;

    private String origin;

    private Integer recommendNum;

    private Integer unrecommendNum;

    private Integer state;

    private String developer;

    private String versionMain;

    private String isbnId;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

    private Integer iosState;

    private Integer androidState;

    private String developerId;

    private Integer testNumber;

    private Date tsetDate;

    private String isbnImage;

    private String copyrightId;

    private String copyrightImage;

    private String credentials;

    private String issueId;

    private String androidPackageName;

    private Integer commentNum;

    private Long boomDownloadNum;

    private Long gameIdtSn;

    private String tabGameId;

    private String googleGameId;

    private Boolean videoUrlLatest;

    private Boolean costFree;

    private String company;

    private String publisher;

    private String androidStatusDesc;

    private String iosStatusDesc;

    private String googleDeputyName;

    private Boolean canFast;

    private Long weekDownloadNum;

    private Double score;

    private String tags;

    private String updateLog;

    private String images;

    private String fungoTalk;

    private String intro;

    private String detail;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getApk() {
        return apk;
    }

    public void setApk(String apk) {
        this.apk = apk == null ? null : apk.trim();
    }

    public Integer getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }

    public String getItunesId() {
        return itunesId;
    }

    public void setItunesId(String itunesId) {
        this.itunesId = itunesId == null ? null : itunesId.trim();
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility == null ? null : compatibility.trim();
    }

    public String getVersionChild() {
        return versionChild;
    }

    public void setVersionChild(String versionChild) {
        this.versionChild = versionChild == null ? null : versionChild.trim();
    }

    public Long getGameSize() {
        return gameSize;
    }

    public void setGameSize(Long gameSize) {
        this.gameSize = gameSize;
    }

    public String getReleaseImage() {
        return releaseImage;
    }

    public void setReleaseImage(String releaseImage) {
        this.releaseImage = releaseImage == null ? null : releaseImage.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public Integer getImageRatio() {
        return imageRatio;
    }

    public void setImageRatio(Integer imageRatio) {
        this.imageRatio = imageRatio;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Date getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Date editedAt) {
        this.editedAt = editedAt;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId == null ? null : communityId.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Integer getRecommendNum() {
        return recommendNum;
    }

    public void setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
    }

    public Integer getUnrecommendNum() {
        return unrecommendNum;
    }

    public void setUnrecommendNum(Integer unrecommendNum) {
        this.unrecommendNum = unrecommendNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getVersionMain() {
        return versionMain;
    }

    public void setVersionMain(String versionMain) {
        this.versionMain = versionMain == null ? null : versionMain.trim();
    }

    public String getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(String isbnId) {
        this.isbnId = isbnId == null ? null : isbnId.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Integer getIosState() {
        return iosState;
    }

    public void setIosState(Integer iosState) {
        this.iosState = iosState;
    }

    public Integer getAndroidState() {
        return androidState;
    }

    public void setAndroidState(Integer androidState) {
        this.androidState = androidState;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId == null ? null : developerId.trim();
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.testNumber = testNumber;
    }

    public Date getTsetDate() {
        return tsetDate;
    }

    public void setTsetDate(Date tsetDate) {
        this.tsetDate = tsetDate;
    }

    public String getIsbnImage() {
        return isbnImage;
    }

    public void setIsbnImage(String isbnImage) {
        this.isbnImage = isbnImage == null ? null : isbnImage.trim();
    }

    public String getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(String copyrightId) {
        this.copyrightId = copyrightId == null ? null : copyrightId.trim();
    }

    public String getCopyrightImage() {
        return copyrightImage;
    }

    public void setCopyrightImage(String copyrightImage) {
        this.copyrightImage = copyrightImage == null ? null : copyrightImage.trim();
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials == null ? null : credentials.trim();
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId == null ? null : issueId.trim();
    }

    public String getAndroidPackageName() {
        return androidPackageName;
    }

    public void setAndroidPackageName(String androidPackageName) {
        this.androidPackageName = androidPackageName == null ? null : androidPackageName.trim();
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Long getBoomDownloadNum() {
        return boomDownloadNum;
    }

    public void setBoomDownloadNum(Long boomDownloadNum) {
        this.boomDownloadNum = boomDownloadNum;
    }

    public Long getGameIdtSn() {
        return gameIdtSn;
    }

    public void setGameIdtSn(Long gameIdtSn) {
        this.gameIdtSn = gameIdtSn;
    }

    public String getTabGameId() {
        return tabGameId;
    }

    public void setTabGameId(String tabGameId) {
        this.tabGameId = tabGameId == null ? null : tabGameId.trim();
    }

    public String getGoogleGameId() {
        return googleGameId;
    }

    public void setGoogleGameId(String googleGameId) {
        this.googleGameId = googleGameId == null ? null : googleGameId.trim();
    }

    public Boolean getVideoUrlLatest() {
        return videoUrlLatest;
    }

    public void setVideoUrlLatest(Boolean videoUrlLatest) {
        this.videoUrlLatest = videoUrlLatest;
    }

    public Boolean getCostFree() {
        return costFree;
    }

    public void setCostFree(Boolean costFree) {
        this.costFree = costFree;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getAndroidStatusDesc() {
        return androidStatusDesc;
    }

    public void setAndroidStatusDesc(String androidStatusDesc) {
        this.androidStatusDesc = androidStatusDesc == null ? null : androidStatusDesc.trim();
    }

    public String getIosStatusDesc() {
        return iosStatusDesc;
    }

    public void setIosStatusDesc(String iosStatusDesc) {
        this.iosStatusDesc = iosStatusDesc == null ? null : iosStatusDesc.trim();
    }

    public String getGoogleDeputyName() {
        return googleDeputyName;
    }

    public void setGoogleDeputyName(String googleDeputyName) {
        this.googleDeputyName = googleDeputyName == null ? null : googleDeputyName.trim();
    }

    public Boolean getCanFast() {
        return canFast;
    }

    public void setCanFast(Boolean canFast) {
        this.canFast = canFast;
    }

    public Long getWeekDownloadNum() {
        return weekDownloadNum;
    }

    public void setWeekDownloadNum(Long weekDownloadNum) {
        this.weekDownloadNum = weekDownloadNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getUpdateLog() {
        return updateLog;
    }

    public void setUpdateLog(String updateLog) {
        this.updateLog = updateLog == null ? null : updateLog.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getFungoTalk() {
        return fungoTalk;
    }

    public void setFungoTalk(String fungoTalk) {
        this.fungoTalk = fungoTalk == null ? null : fungoTalk.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", video=").append(video);
        sb.append(", apk=").append(apk);
        sb.append(", downloadNum=").append(downloadNum);
        sb.append(", itunesId=").append(itunesId);
        sb.append(", compatibility=").append(compatibility);
        sb.append(", versionChild=").append(versionChild);
        sb.append(", gameSize=").append(gameSize);
        sb.append(", releaseImage=").append(releaseImage);
        sb.append(", name=").append(name);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", imageRatio=").append(imageRatio);
        sb.append(", icon=").append(icon);
        sb.append(", editedAt=").append(editedAt);
        sb.append(", communityId=").append(communityId);
        sb.append(", memberId=").append(memberId);
        sb.append(", origin=").append(origin);
        sb.append(", recommendNum=").append(recommendNum);
        sb.append(", unrecommendNum=").append(unrecommendNum);
        sb.append(", state=").append(state);
        sb.append(", developer=").append(developer);
        sb.append(", versionMain=").append(versionMain);
        sb.append(", isbnId=").append(isbnId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", iosState=").append(iosState);
        sb.append(", androidState=").append(androidState);
        sb.append(", developerId=").append(developerId);
        sb.append(", testNumber=").append(testNumber);
        sb.append(", tsetDate=").append(tsetDate);
        sb.append(", isbnImage=").append(isbnImage);
        sb.append(", copyrightId=").append(copyrightId);
        sb.append(", copyrightImage=").append(copyrightImage);
        sb.append(", credentials=").append(credentials);
        sb.append(", issueId=").append(issueId);
        sb.append(", androidPackageName=").append(androidPackageName);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", boomDownloadNum=").append(boomDownloadNum);
        sb.append(", gameIdtSn=").append(gameIdtSn);
        sb.append(", tabGameId=").append(tabGameId);
        sb.append(", googleGameId=").append(googleGameId);
        sb.append(", videoUrlLatest=").append(videoUrlLatest);
        sb.append(", costFree=").append(costFree);
        sb.append(", company=").append(company);
        sb.append(", publisher=").append(publisher);
        sb.append(", androidStatusDesc=").append(androidStatusDesc);
        sb.append(", iosStatusDesc=").append(iosStatusDesc);
        sb.append(", googleDeputyName=").append(googleDeputyName);
        sb.append(", canFast=").append(canFast);
        sb.append(", weekDownloadNum=").append(weekDownloadNum);
        sb.append(", score=").append(score);
        sb.append(", tags=").append(tags);
        sb.append(", updateLog=").append(updateLog);
        sb.append(", images=").append(images);
        sb.append(", fungoTalk=").append(fungoTalk);
        sb.append(", intro=").append(intro);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}