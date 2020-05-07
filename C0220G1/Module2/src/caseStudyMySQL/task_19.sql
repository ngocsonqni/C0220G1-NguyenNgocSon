update DichVuDiKem
set DichVuDiKem.Gia=DichVuDiKem.Gia*10
where DichVuDiKem.IDDichVuDiKem in (
		select x.IDDichVuDiKem
		from (select  dvdk.*, sum(hdct.SoLuong) as SumDVDK
				from DichVuDiKem as dvdk
					inner join HopDongChiTiet as hdct on dvdk.IDDichVuDiKem=hdct.IDDichVuDiKem
				group by dvdk.TenDichVuDiKem
				order by sumDVDK desc) as x
		where SumDVDK>10
)