INSERT INTO youbike (
    sno, sna, sarea, mday, ar, sareaen, snaen, aren, act,
    srcUpdateTime, updateTime, infoTime, infoDate,
    total, available_rent_bikes, latitude, longitude, available_return_bikes
) VALUES (
    ?, ?, ?, ?, ?, ?, ?, ?, ?,
    ?, ?, ?, ?,
    ?, ?, ?, ?, ?
)
ON DUPLICATE KEY UPDATE
    sna = VALUES(sna),
    sarea = VALUES(sarea),
    mday = VALUES(mday),
    ar = VALUES(ar),
    sareaen = VALUES(sareaen),
    snaen = VALUES(snaen),
    aren = VALUES(aren),
    act = VALUES(act),
    srcUpdateTime = VALUES(srcUpdateTime),
    updateTime = VALUES(updateTime),
    infoTime = VALUES(infoTime),
    infoDate = VALUES(infoDate),
    total = VALUES(total),
    available_rent_bikes = VALUES(available_rent_bikes),
    latitude = VALUES(latitude),
    longitude = VALUES(longitude),
    available_return_bikes = VALUES(available_return_bikes);
