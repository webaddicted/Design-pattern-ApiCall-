package com.deepaksharma.webaddicted.apicalling.ui.vo;


public class LoginResponse {


    private Boolean status;
    private String message;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String name;
        private String email;
        private String fb_id;
        private int user_type;
        private String phone;
        private String image_path;
        private String created_at;
        private String updated_at;
        private Object stripe_id;
        private Object card_brand;
        private Object card_last_four;
        private Object trial_ends_at;
        private String username;
        private String lat;
        private String lng;
        private int is_manual;
        private String dob;
        private int is_emailed;
        private String user_bio;
        private int badge;
        private int is_privacy_enabled;
        private Object decrypted_pwd;
        private boolean is_new_user;
        private Object is_normal_user;
        private int total_follow;
        private int has_shop;
        private Object shop;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFb_id() {
            return fb_id;
        }

        public void setFb_id(String fb_id) {
            this.fb_id = fb_id;
        }

        public int getUser_type() {
            return user_type;
        }

        public void setUser_type(int user_type) {
            this.user_type = user_type;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getImage_path() {
            return image_path;
        }

        public void setImage_path(String image_path) {
            this.image_path = image_path;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getStripe_id() {
            return stripe_id;
        }

        public void setStripe_id(Object stripe_id) {
            this.stripe_id = stripe_id;
        }

        public Object getCard_brand() {
            return card_brand;
        }

        public void setCard_brand(Object card_brand) {
            this.card_brand = card_brand;
        }

        public Object getCard_last_four() {
            return card_last_four;
        }

        public void setCard_last_four(Object card_last_four) {
            this.card_last_four = card_last_four;
        }

        public Object getTrial_ends_at() {
            return trial_ends_at;
        }

        public void setTrial_ends_at(Object trial_ends_at) {
            this.trial_ends_at = trial_ends_at;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public int getIs_manual() {
            return is_manual;
        }

        public void setIs_manual(int is_manual) {
            this.is_manual = is_manual;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public int getIs_emailed() {
            return is_emailed;
        }

        public void setIs_emailed(int is_emailed) {
            this.is_emailed = is_emailed;
        }

        public String getUser_bio() {
            return user_bio;
        }

        public void setUser_bio(String user_bio) {
            this.user_bio = user_bio;
        }

        public int getBadge() {
            return badge;
        }

        public void setBadge(int badge) {
            this.badge = badge;
        }

        public int getIs_privacy_enabled() {
            return is_privacy_enabled;
        }

        public void setIs_privacy_enabled(int is_privacy_enabled) {
            this.is_privacy_enabled = is_privacy_enabled;
        }

        public Object getDecrypted_pwd() {
            return decrypted_pwd;
        }

        public void setDecrypted_pwd(Object decrypted_pwd) {
            this.decrypted_pwd = decrypted_pwd;
        }

        public boolean isIs_new_user() {
            return is_new_user;
        }

        public void setIs_new_user(boolean is_new_user) {
            this.is_new_user = is_new_user;
        }

        public Object getIs_normal_user() {
            return is_normal_user;
        }

        public void setIs_normal_user(Object is_normal_user) {
            this.is_normal_user = is_normal_user;
        }

        public int getTotal_follow() {
            return total_follow;
        }

        public void setTotal_follow(int total_follow) {
            this.total_follow = total_follow;
        }

        public int getHas_shop() {
            return has_shop;
        }

        public void setHas_shop(int has_shop) {
            this.has_shop = has_shop;
        }

        public Object getShop() {
            return shop;
        }

        public void setShop(Object shop) {
            this.shop = shop;
        }
    }
}
