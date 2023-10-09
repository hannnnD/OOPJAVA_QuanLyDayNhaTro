CREATE DATABASE QUANLYPHONGTRO
GO
USE QUANLYPHONGTRO
GO
DROP DATABASE QUANLYPHONGTRO

CREATE TABLE USER_KHACHTHUE 
(
	UserID INT identity (1,1)PRIMARY KEY,
	Username  nvarchar (25),
	Pwd nvarchar(25),
	IsAdmin int check (IsAdmin IN (1,0)) Default 0,
	MaKhach varchar(5),
	TenKhach nvarchar(30),
	Email varchar(30), 
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
	DienThoai varchar(11),
	TinhTrang int,
)
GO
CREATE TABLE KHACH_THUE 
(
	MaKhach varchar(5) primary key,
	TenKhach nvarchar(30),
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
)
GO
CREATE TABLE PHONG_TRO
(
	MaPhong varchar(5)primary key,
	TrangThai int check (TrangThai IN (1,0)) Default 0,
	ThongTinPhong nvarchar(50),
	SoNguoi int,
)
GO
CREATE TABLE GIA_THUE
(
	SoNguoi int primary key,
	GiaTien money,
)
GO
CREATE TABLE CT_KHACH_THUE
(
	MaKhach varchar(5),
	MaPhong varchar(5),
	NgayVaoPhong datetime,
	
)

GO
CREATE TABLE HOA_DON
(
	MaHoaDon int identity(1,1) primary key,
	NgayLap datetime,
	MaPhong varchar(5),
)
GO
CREATE TABLE HOP_DONG 
(
	MaHopDong int identity primary key,
	NgayLap datetime,
	MaPhong varchar(5),
)
GO

CREATE TABLE DICH_VU 
(
	MaDichVu varchar(5) primary key,
	DichVu nvarchar(30),
	GiaDichVu money,
	MaLoaiDichVu varchar(5),
	QuyCach nvarchar(30),
)
GO
CREATE TABLE LOAI_DICH_VU
(
	MaLoaiDichVu varchar(5) primary key,
	TenLoaiDichVu nvarchar(20),
)
GO

Create table CT_DICHVU
(
	MaHoaDon int,
	MaDichVu varchar(5),
	DonViSuDung int,
)
ALTER TABLE DICH_VU
ADD CONSTRAINT FK_DICHVU_LOAIDICHVU FOREIGN KEY (MaLoaiDichVu)
REFERENCES LOAI_DICH_VU (MaLoaiDichVu)
ON UPDATE CASCADE

ALTER TABLE PHONG_TRO
ADD CONSTRAINT FK_PHONGTRO_GIATHUE FOREIGN KEY (SoNguoi)
REFERENCES GIA_THUE (SoNguoi)
ON UPDATE CASCADE

ALTER TABLE HOP_DONG
ADD CONSTRAINT FK_PHONGTRO_HOPDONG FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE
GO
ALTER TABLE USER_KHACHTHUE
ADD CONSTRAINT FK_USERKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)
ON UPDATE CASCADE

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)
ON UPDATE CASCADE

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE

ALTER TABLE HOA_DON
ADD CONSTRAINT FK_HOADON_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_HOADON_CTDICHVU FOREIGN KEY (MaHoaDon)
REFERENCES HOA_DON (MaHoaDon)
ON UPDATE CASCADE

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_DICHVU_CTDICHVU FOREIGN KEY (MaDichVu)
REFERENCES DICH_VU (MaDichVu)
ON UPDATE CASCADE
GO

INSERT KHACH_THUE VALUES ('K01',N'Nguyễn Văn A','Nam',001203001,N'Hà Nội',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K02',N'Nguyễn Thị B',N'Nữ',001203002,N'Hà Nội',N'Công nhân'	)
INSERT KHACH_THUE VALUES ('K03',N'Mạc Văn C','Nam',001203003,N'Hòa Bình',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K04',N'Lê Đức A','Nam',001203004,N'Bắc Giang',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K05',N'Lưu Bảo Nam','Nam',001203005,N'Bắc Ninh',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K06',N'Lưu Chi','Nữ',001203006,N'Hà Nam',N'Nhân viên')		
INSERT KHACH_THUE VALUES ('K07',N'Lý Khánh','Nam',001203007,N'Ninh Bình',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K08',N'Hoàng Anh','Nam',001203008,N'Cao Bằng',N'Lái xe')
INSERT KHACH_THUE VALUES ('K09',N'Nguyễn Tú','Nữ',001203009,N'Nghệ An',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K10',N'Đỗ','Nam',001203010,N'Phú Thọ',N'Sinh viên')		
		
GO

INSERT USER_KHACHTHUE VALUES ('admin','admin',1,NULL,	NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
GO
--GIA_THUE
INSERT GIA_THUE VALUES (1,750000)
INSERT GIA_THUE VALUES (2,1500000)
INSERT GIA_THUE VALUES (3,2000000)
INSERT GIA_THUE VALUES (4,2500000)
INSERT GIA_THUE VALUES (5,3000000)

GO
--PHONG_TRO
INSERT PHONG_TRO VALUES ('A101',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A102',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A103',1,	NULL,	2)	
INSERT PHONG_TRO VALUES ('A104',1,	NULL,	1)	
INSERT PHONG_TRO VALUES ('A105',1,	NULL,	1)		
INSERT PHONG_TRO VALUES ('A106',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('A107',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('A108',0,	NULL,	NULL)		
INSERT PHONG_TRO VALUES ('A109',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('A110',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B101',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B102',0,	NULL,	NULL)
INSERT PHONG_TRO VALUES ('B103',0,	NULL,	NULL)		
INSERT PHONG_TRO VALUES ('B104',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B105',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B106',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B107',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B108',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B109',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B110',0,	NULL,	NULL)	

GO
--CT_KHACH_THUE
set dateformat dmy
INSERT CT_KHACH_THUE VALUES ('K01', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K02', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K03', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K04', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K05', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K06', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K07', 'A103',NULL)
INSERT CT_KHACH_THUE VALUES ('K08', 'A103',NULL)
INSERT CT_KHACH_THUE VALUES ('K09', 'A104',NULL)
INSERT CT_KHACH_THUE VALUES ('K10', 'A105',NULL)

GO

--LOAI_DICH_VU
INSERT LOAI_DICH_VU VALUES ('DV01', N'Giải trí')
INSERT LOAI_DICH_VU VALUES ('DV02', N'Ăn uống')
INSERT LOAI_DICH_VU VALUES ('DV03', N'Điện/Nước')

GO
--DICH_VU
INSERT DICH_VU VALUES ('NET',N'Internet',200000, 'DV01',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('NUOC'	,N'Nước (uống)',50000,	'DV02',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('ELECT'	,N'Điện',		3500,	'DV03',N'Đồng/kí')
INSERT DICH_VU VALUES ('WATER'	,N'Nước (máy)',		20000,	'DV03',N'Đồng/khối')

GO

--CT_DICHVU
set dateformat dmy



go
--Procedure--
--Thêm khách thuê--
create proc ThemKhachThue
(
@makhach varchar(5),
@tenkhach nvarchar(30),
@phai nvarchar(5),
@cmnd varchar(15),
@quequan nvarchar(30),
@nghenghiep nvarchar(30),
@Taikhoan varchar(25)
)
as
	begin
	if(@Taikhoan IS NULL)--Nếu như khách không có tài khoản--
		insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)

	else
		if(@Taikhoan IS NOT NULL)--Nếu như khách có tài khoản--
		begin
			insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
			insert into USER_KHACHTHUE (Username,Pwd,IsAdmin,MaKhach)values(@Taikhoan,@Taikhoan,0, @makhach)
			update USER_KHACHTHUE set Makhach = @makhach where makhach = @makhach
			update USER_KHACHTHUE set Tinhtrang = 0 where makhach = @makhach 
		end
	end
go

--Xóa khách thuê--
create proc XoaKhach
(
@makhach varchar(5),
@taikhoan varchar(25)
)
as
	begin
	--nếu như khách không có tài khoản và chưa thuê phòng--
	if(@taikhoan IS NULL AND NOT EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
			begin
				delete from KHACH_THUE where MaKhach = @makhach
			end
		else
	--nếu như khách không có tài khoản và đã thuê phòng--
	if(@taikhoan IS NULL AND EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
			begin
				delete from CT_KHACH_THUE where MaKhach = @makhach
				delete from KHACH_THUE where MaKhach = @makhach
			end
	--nếu khách có tài khoản và chưa thuê phòng--
	if(@taikhoan IS NOT NULL AND NOT EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
		begin
			delete from USER_KHACHTHUE where MaKhach = @makhach
			delete from KHACH_THUE where MaKhach = @makhach
		end
	--nếu khách có tài khoản và đã thuê phòng--
	if(@taikhoan IS NOT NULL AND EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
		begin
			delete from CT_KHACH_THUE where MaKhach = @makhach
			delete from USER_KHACHTHUE where MaKhach = @makhach
			delete from KHACH_THUE where MaKhach = @makhach
		end
	end
go

--Sửa khách thuê--
create proc SuaKhachThue
(
	@makhach varchar(5),
	@tenkhach nvarchar(30),
	@phai nvarchar(5),
	@cmnd varchar(15),
	@quequan nvarchar(30),
	@nghenghiep nvarchar(30)
)
as
	begin
		update KHACH_THUE
		set TenKhach = @tenkhach,
			Phai = @phai,
			CMND = @cmnd,
			QueQuan = @quequan,
			NgheNghiep = @nghenghiep
		where MaKhach = @makhach
	end
go
---Bảng giá phòng trọ--
--Thêm phòng--

create proc ThemPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		insert into GIA_THUE values(@songuoi,@giatien)
	end
go
--Sửa giá tiền--

create proc SuaPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		update GIA_THUE
		set GiaTien = @giatien
		where SoNguoi =@songuoi
	end
go

--Thêm khách thuê vào ở ghép--
set dateformat dmy
go

--Khi khách thuê vào ở ghép thì ta phải cập nhật lại số người bên PHONG_TRO--
create proc ThemKhachThueVaooGhep
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi+=1 where MaPhong = @MaPhong
	end
	go
go
--Thêm khách thuê vào phòng mới--
--Khi khách thuê vào ở mới thì ta phải cập nhật lại số người bên PHONG_TRO--
create proc ThemKhachThueVaoPhongMoi
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into HOP_DONG values(convert(varchar(10),@NgayVaoPhong,103),@MaPhong)
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi=1 where MaPhong = @MaPhong
	end
go
--Thêm mới hóa đơn và chi tiết hóa đơn--
--Thêm mới hóa đơn--
create proc ThemHoaDon
(
	@maphong varchar(5),
	@ngaylap datetime
)
as
	begin
		insert into HOA_DON values(convert(varchar(10),@ngaylap,103), @maphong)
	end
	
go
--Thêm mới chi tiết hóa đơn--
create proc ThemChiTietDichVu
(
	@madichvu varchar(5),
	@donvisudung int
)
as
	begin
		declare @mahoadon int
			set @mahoadon= (select top(1) mahoadon from HOA_DON order by MaHoaDon desc)
		insert into CT_DICHVU values ( @mahoadon,@madichvu, @donvisudung)
	end
go
--Xóa hóa đơn và chi tiết hóa đơn--
create proc XoaHoaDon
(
	@mahoadon int
)
as
	begin
		delete from CT_DICHVU where @mahoadon = MaHoaDon
		delete from HOA_DON where @mahoadon = MaHoaDon
	end
go
------- Thông tin dịch vụ--
--Thêm dịch vụ--
create proc ThemDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		insert into DICH_VU values(@madichvu,@tendichvu,@giatien,@maloaidichvu,@quycach)
	end
go
--Sửa dịch vụ--

create proc SuaDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		update DICH_VU
		set DichVu = @tendichvu,
			GiaDichVu = @giatien,
			MaLoaiDichVu = @maloaidichvu,
			QuyCach = @quycach
		where MaDichVu = @madichvu
	end
go
-- Xóa Dịch vụ--

create proc XoaDichVu
(
	@MaDichVu varchar(5)
)
as
	begin
		delete from DICH_VU where MaDichVu  = @MaDichVu
	end
go
--Đổi mật khẩu ADMIN--
create proc DoiMatKhauADMIN
(
	@taikhoan varchar(25),
	@matkhaumoi varchar(25)
)
as
	begin
		update USER_KHACHTHUE 
			set pwd = @matkhaumoi
			where Username = @taikhoan
	end
