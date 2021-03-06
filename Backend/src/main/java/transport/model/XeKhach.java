package transport.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

@Entity
//@RequiredArgsConstructor
public class XeKhach {
	@Id
	@Column(name="xeKhachId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int xeKhachId;
	@NotNull
	private String bienSo;
	private String mauXe;
	private String hangSanXuat;
	private int doiXe;
	private String model;
	@NotNull
	private int soGhe;
	private int soNamSuDung;
	private Date ngayBaoDuong;
	@OneToMany(mappedBy = "xeKhach", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<ChuyenXe> listChuyenXe;

	public XeKhach(){}

	public XeKhach(int xeKhachId, String bienSo, String mauXe, String hangSanXuat, int doiXe, String model, int soGhe, int soNamSuDung, Date ngayBaoDuong){
		this.xeKhachId = xeKhachId;
		this.bienSo = bienSo;
		this.mauXe = mauXe;
		this.hangSanXuat = hangSanXuat;
		this.doiXe = doiXe;
		this.model = model;
		this.soGhe = soGhe;
		this.soNamSuDung = soNamSuDung;
		this.ngayBaoDuong = ngayBaoDuong;
	}

	public XeKhach(String bienSo, String mauXe, String hangSanXuat, int doiXe, String model, int soGhe, int soNamSuDung, Date ngayBaoDuong){
		this.bienSo = bienSo;
		this.mauXe = mauXe;
		this.hangSanXuat = hangSanXuat;
		this.doiXe = doiXe;
		this.model = model;
		this.soGhe = soGhe;
		this.soNamSuDung = soNamSuDung;
		this.ngayBaoDuong = ngayBaoDuong;
	}

	public int getXeKhachId() {
		return xeKhachId;
	}

	public void setXeKhachId(int xeKhachId) {
		this.xeKhachId = xeKhachId;
	}

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public int getDoiXe() {
		return doiXe;
	}

	public void setDoiXe(int doiXe) {
		this.doiXe = doiXe;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}

	public int getSoNamSuDung() {
		return soNamSuDung;
	}

	public void setSoNamSuDung(int soNamSuDung) {
		this.soNamSuDung = soNamSuDung;
	}

	public Date getNgayBaoDuong() {
		return ngayBaoDuong;
	}

	public void setNgayBaoDuong(Date ngayBaoDuong) {
		this.ngayBaoDuong = ngayBaoDuong;
	}

	@JsonIgnore
	private List<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	@JsonIgnore
	private void setListChuyenXe(List<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}
}
