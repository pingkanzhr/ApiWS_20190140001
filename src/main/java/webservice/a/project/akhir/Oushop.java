/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservice.a.project.akhir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@Entity
@Table(name="oushop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Oushop {
    @Id
    private String kode;
    private String model;
    private String size;
    private String warna;
    private String harga;
    
}
