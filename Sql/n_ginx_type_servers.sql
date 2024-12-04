create table if not exists n_ginx_type_servers(
type_ip_number Integer not null,
type_server_dns varchar(255) null,
http_proxy_for_server_group varchar(255) null,
server_directive varchar(255) null,
group_servers_config_location varchar(255) null,
load_balancing_type varchar(255) null,
server_location bigint null,
proxy_label varchar(255) null,
backup_opts varchar(255) null,
main_web_server varchar(255) null,
entity_state varchar(255) null,
constraint n_ginx_type_servers_pk primary key(type_ip_number));