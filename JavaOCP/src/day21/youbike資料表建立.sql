use web;
create table if not exists youbike (
	sno varchar(20) primary key, -- 站點代號(主鍵)
	sna varchar(100), -- 站名(中文)
	sarea varchar(100), -- 地區
	mday varchar(20), -- 資料時間
	ar varchar(200), -- 地址
	sareaen varchar(100), -- 地區(英文)
	snaen varchar(100), -- 站名(英文)
	aren varchar(200), -- 地址(英文)
	act varchar(10), -- 是否啟用(1/0)
	srcupdatetime varchar(30), -- 原始資料更新時間
	updatetime varchar(30), -- 資料處理時間
	infotime varchar(30), -- 資訊時間
	infodate date, -- 資訊日期
	total int, -- 全部車數
	available_rent_bikes int, -- 可借車數
	latitude double, -- 緯度
    longitude double, -- 經度
    available_return_bikes int -- 可還車數
)