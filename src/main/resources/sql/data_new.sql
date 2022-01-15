INSERT INTO permission(permission_id, name)
VALUES (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN')
;

INSERT INTO role_group(group_id, name)
VALUES (1, 'USER_GROUP'),
       (2, 'ADMIN_GROUP')
;

INSERT INTO group_permission(group_permission_id, group_id, permission_id)
VALUES (1, 1, 1),
       (2, 2, 1),
       (3, 2, 2)
;

INSERT INTO member(member_id, name, provider, social_id, profile_image, group_id, created_at, last_modified_at)
VALUES (1, 'dokev_user', 'kakao', 'k1', 'http://dokev/image.jpg', 1, NOW(), NOW()),
       (2, 'dokev_admin', 'kakao', 'k2', 'http://dokev/image.jpg', 2, NOW(), NOW())
;

