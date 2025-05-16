INSERT INTO youbike (
    sno, sna, sarea, mday, ar, sareaen, snaen, aren, act,
    srcupdatetime, updatetime, infotime, infodate,
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
    srcupdatetime = VALUES(srcupdatetime),
    updatetime = VALUES(updatetime),
    infotime = VALUES(infotime),
    infodate = VALUES(infodate),
    total = VALUES(total),
    available_rent_bikes = VALUES(available_rent_bikes),
    latitude = VALUES(latitude),
    longitude = VALUES(longitude),
    available_return_bikes = VALUES(available_return_bikes);
