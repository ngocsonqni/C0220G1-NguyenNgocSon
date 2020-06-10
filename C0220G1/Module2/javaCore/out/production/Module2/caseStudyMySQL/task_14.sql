select x.*
from (select  dvdk.*, sum(hdct.SoLuong) as SumDVDK
		from DichVuDiKem as dvdk
			inner join HopDongChiTiet as hdct on dvdk.IDDichVuDiKem=hdct.IDDichVuDiKem
            group by dvdk.TenDichVuDiKem
            order by sumDVDK asc) as x
where x.sumDVDK=1
group by x.IDDichVuDiKem