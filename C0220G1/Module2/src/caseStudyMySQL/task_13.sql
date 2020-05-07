select x.*
from (select  dvdk.*, sum(hdct.SoLuong) as SumDVDK
		from DichVuDiKem as dvdk
			inner join HopDongChiTiet as hdct on dvdk.IDDichVuDiKem=hdct.IDDichVuDiKem
            group by dvdk.TenDichVuDiKem
            order by sumDVDK desc) as x
	inner join (select  dvdk.*, sum(hdct.SoLuong) as SumDVDK
		from DichVuDiKem as dvdk
			inner join HopDongChiTiet as hdct on dvdk.IDDichVuDiKem=hdct.IDDichVuDiKem
            group by dvdk.TenDichVuDiKem
            order by sumDVDK desc
            limit 1) as x2 on x.SumDVDK=x2.SumDVDK
group by x.IDDichVuDiKem
