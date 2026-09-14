# ☕ Panduan Lengkap Instalasi Lingkungan Pengembangan Java (Linux & Windows)

Dokumentasi ini berisi panduan langkah demi langkah yang detail dan terstruktur untuk menginstal **Java (JDK)**, **IntelliJ IDEA Ultimate (Lisensi Student)**, dan **Visual Studio Code (beserta Ekstensi Java)** pada sistem operasi **Linux** dan **Windows** berdasarkan dokumentasi resmi terbaru.

---

## 📌 Daftar Isi
1. [Prasyarat & Persiapan Awal](#1-prasyarat--persiapan-awal)
2. [Instalasi Java (JDK - Java Development Kit)](#2-instalasi-java-jdk---java-development-kit)
   - [2.1 Mengunduh & Menginstal JDK di Windows](#21-mengunduh--menginstal-jdk-di-windows)
   - [2.2 Mengunduh & Menginstal JDK di Linux](#22-mengunduh--menginstal-jdk-di-linux)
   - [2.3 Konfigurasi & Verifikasi Environment Variables (`JAVA_HOME`)](#23-konfigurasi--verifikasi-environment-variables-java_home)
3. [Instalasi & Konfigurasi IntelliJ IDEA for Students](#3-instalasi--konfigurasi-intellij-idea-for-students)
   - [3.1 Cara Pengajuan Lisensi Student (JetBrains Educational License)](#31-cara-pengajuan-lisensi-student-jetbrains-educational-license)
   - [3.2 Instalasi IntelliJ IDEA di Windows](#32-instalasi-intellij-idea-di-windows)
   - [3.3 Instalasi IntelliJ IDEA di Linux](#33-instalasi-intellij-idea-di-linux)
   - [3.4 Aktivasi Lisensi & Setup JDK di IntelliJ IDEA](#34-aktivasi-lisensi--setup-jdk-di-intellij-idea)
4. [Instalasi & Konfigurasi Visual Studio Code (VS Code)](#4-instalasi--konfigurasi-visual-studio-code-vs-code)
   - [4.1 Instalasi VS Code di Windows](#41-instalasi-vs-code-di-windows)
   - [4.2 Instalasi VS Code di Linux](#42-instalasi-vs-code-di-linux)
   - [4.3 Instalasi Ekstensi Wajib Java di VS Code](#43-instalasi-ekstensi-wajib-java-di-vs-code)
   - [4.4 Konfigurasi `settings.json` di VS Code](#44-konfigurasi-settingsjson-di-vs-code)
5. [Pengujian Proyek Pertama (Hello World)](#5-pengujian-proyek-pertama-hello-world)
6. [Troubleshooting & Masalah Umum](#6-troubleshooting--masalah-umum)

---

## 1. Prasyarat & Persiapan Awal

Sebelum memulai instalasi, pastikan sistem Anda memenuhi spesifikasi minimum berikut:
- **Sistem Operasi**: 
  - Windows 10/11 (64-bit)
  - Distribusi Linux 64-bit (Ubuntu 20.04+, Debian 11+, Fedora 36+, Arch Linux, dll.)
- **RAM**: Minimal 4 GB (Sangat direkomendasikan **8 GB atau lebih** untuk IntelliJ IDEA).
- **Ruang Penyimpanan**: Minimal 5-10 GB ruang kosong SSD/HDD.
- **Koneksi Internet**: Diperlukan untuk mengunduh installer, lisensi student, dan ekstensi.

---

## 2. Instalasi Java (JDK - Java Development Kit)

Java memerlukan **JDK (Java Development Kit)** untuk mengompilasi dan menjalankan program Java. Anda bisa memilih dari beberapa vendor distribusi JDK populer:
- **Oracle JDK**: Distribusi resmi dari Oracle (Gratis untuk penggunaan pengembang/non-komersial).
- **Eclipse Temurin (Adoptium)**: Open-source, didukung oleh Eclipse Foundation (Sangat direkomendasikan untuk kepatuhan open-source).
- **OpenJDK**: Build standar open-source Java.

> [!NOTE]
> Disarankan menggunakan versi **LTS (Long-Term Support)** terbaru seperti **Java 21** atau **Java 17**.

---

### 2.1 Mengunduh & Menginstal JDK di Windows

#### Metode A: GUI Installer (.msi / .exe) — Direkomendasikan
1. Buka situs resmi penyedia JDK:
   - **Eclipse Temurin (Adoptium)**: [adoptium.net](https://adoptium.net/)
   - **Oracle JDK**: [oracle.com/java/technologies/downloads](https://www.oracle.com/java/technologies/downloads/)
2. Pilih versi **JDK 21 (LTS)** dan OS **Windows (x64)**.
3. Unduh berkas format **Installer (`.msi` atau `.exe`)**.
4. Jalankan installer tersebut.
5. Pada wizard instalasi Temurin/Adoptium:
   - Pastikan opsi **"Set JAVA_HOME variable"** dan **"Add to PATH"** dicentang / diaktifkan menjadi *Will be installed on local hard drive*.
6. Klik **Next** sampai instalasi selesai.

#### Metode B: Windows Package Manager (`winget`)
Buka **PowerShell** atau **Command Prompt** sebagai Administrator, lalu jalankan salah satu perintah berikut:

- **Eclipse Temurin JDK 21**:
  ```powershell
  winget install EclipseAdoptium.Temurin.21.JDK
  ```
- **Oracle JDK 21**:
  ```powershell
  winget install Oracle.JDK.21
  ```

---

### 2.2 Mengunduh & Menginstal JDK di Linux

#### Metode A: Menggunakan Package Manager (Ubuntu / Debian)
1. Buka Terminal (`Ctrl+Alt+T`).
2. Perbarui indeks paket:
   ```bash
   sudo apt update
   ```
3. Install OpenJDK 21 JDK:
   ```bash
   sudo apt install openjdk-21-jdk -y
   ```

#### Metode B: Menggunakan Package Manager (Fedora / RHEL / AlmaLinux)
```bash
sudo dnf check-update
sudo dnf install java-21-openjdk-devel -y
```

#### Metode C: Menggunakan Package Manager (Arch Linux / Manjaro)
```bash
sudo pacman -Sy jdk21-openjdk
```

#### Metode D: Instalasi Manual via Tarball (`.tar.gz`) — Universal Semua Linux
1. Unduh berkas `.tar.gz` dari [Adoptium.net](https://adoptium.net/).
2. Ekstrak arsip ke direktori `/usr/lib/jvm/`:
   ```bash
   sudo mkdir -p /usr/lib/jvm
   sudo tar -xzf OpenJDK21U-jdk_x64_linux_hotspot_21.0.2_13.tar.gz -C /usr/lib/jvm/
   ```
3. Daftarkan versi Java ke sistem menggunakan `update-alternatives`:
   ```bash
   sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-21.0.2+13/bin/java 100
   sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-21.0.2+13/bin/javac 100
   ```

---

### 2.3 Konfigurasi & Verifikasi Environment Variables (`JAVA_HOME`)

#### Pada Windows:
1. Buka Start Menu, cari **"Edit the system environment variables"** (Edit variabel lingkungan sistem).
2. Klik tombol **Environment Variables...**.
3. Di bagian **System variables**:
   - Klik **New...**
   - **Variable name**: `JAVA_HOME`
   - **Variable value**: Path tempat JDK terinstall (misal: `C:\Program Files\Eclipse Adoptium\jdk-21.0.2.13-hotspot` atau `C:\Program Files\Java\jdk-21`).
4. Cari variabel bernama **`Path`** di System variables, pilih dan klik **Edit...**.
5. Klik **New** lalu tambahkan: `%JAVA_HOME%\bin`.
6. Klik **OK** pada semua jendela.

#### Pada Linux:
Edit berkas profil shell Anda (misal `~/.bashrc` atau `~/.zshrc`):
```bash
nano ~/.bashrc
```
Tambahkan baris berikut di bagian paling bawah:
```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64   # Sesuaikan dengan lokasi instalasi JDK Anda
export PATH=$JAVA_HOME/bin:$PATH
```
Simpan (`Ctrl+O`, `Enter`) dan keluar (`Ctrl+X`), lalu muat ulang profil:
```bash
source ~/.bashrc
```

#### Verifikasi Instalasi (Windows & Linux):
Buka Terminal / Command Prompt baru dan jalankan:
```bash
java -version
javac -version
```
**Output sukses** akan menampilkan informasi versi Java yang terinstall, contoh:
```text
openjdk version "21.0.2" 2024-01-16 LTS
OpenJDK Runtime Environment Temurin-21.0.2+13 (build 21.0.2+13)
OpenJDK 64-Bit Server VM Temurin-21.0.2+13 (build 21.0.2+13, mixed mode, sharing)
```

---

## 3. Instalasi & Konfigurasi IntelliJ IDEA for Students

IntelliJ IDEA adalah Integrated Development Environment (IDE) terbaik dari JetBrains untuk pengembangan Java. JetBrains menyediakan lisensi **IntelliJ IDEA Ultimate gratis** untuk mahasiswa dan pengajar aktif.

---

### 3.1 Cara Pengajuan Lisensi Student (JetBrains Educational License)

1. **Buka Halaman Pendaftaran**:
   Kunjungi [JetBrains Official Education Page](https://www.jetbrains.com/community/education/#students).
2. **Klik "Apply Now"**:
   Pilih kategori **For Students and Teachers**.
3. **Pilih Metode Verifikasi**:
   - **University email address** *(Paling Cepat)*: Menggunakan email berdomain kampus (contoh: `nim@mahasiswa.ac.id` atau `user@university.edu`).
   - **ISIC/ITIC Card**: Menggunakan Kartu Mahasiswa Internasional.
   - **Official Official Documents**: Mengunggah Kartu Tanda Mahasiswa (KTM) atau Surat Keterangan Mahasiswa Aktif / Transkrip Nilai.
4. **Konfirmasi Email**:
   JetBrains akan mengirimkan email konfirmasi. Buka email Anda dan klik link verifikasi yang diberikan.
5. **Buat / Hubungkan Akun JetBrains (JetBrains Account)**:
   Setelah verifikasi berhasil, buat akun baru atau login menggunakan akun JetBrains Anda. Lisensi Educational Pack akan otomatis terhubung ke akun tersebut.

---

### 3.2 Instalasi IntelliJ IDEA di Windows

#### Metode A: Menggunakan JetBrains Toolbox App (Direkomendasikan)
1. Unduh **JetBrains Toolbox App** di [jetbrains.com/toolbox-app/](https://www.jetbrains.com/toolbox-app/).
2. Jalankan installer `.exe` dan buka JetBrains Toolbox.
3. Temukan **IntelliJ IDEA Ultimate** dan klik **Install**.

#### Metode B: Installer Langsung (.exe)
1. Kunjungi [jetbrains.com/idea/download/#section=windows](https://www.jetbrains.com/idea/download/#section=windows).
2. Unduh versi **IntelliJ IDEA Ultimate** (`.exe`).
3. Jalankan file installer.
4. Opsi Instalasi yang disarankan:
   - Dicentang: **Create Desktop Shortcut**.
   - Dicentang: **Add "bin" folder to the PATH**.
   - Dicentang: **Add "Open Folder as Project"**.
   - Associate files: Dicentang `.java`.
5. Klik **Next** -> **Install** -> Restart PC jika diminta.

---

### 3.3 Instalasi IntelliJ IDEA di Linux

#### Metode A: Menggunakan Snap Store (Ubuntu / Debian / Fedora dengan Snap)
Cara paling cepat dan aman di Linux:
```bash
sudo snap install intellij-idea-ultimate --classic
```

#### Metode B: Menggunakan JetBrains Toolbox App
1. Unduh `jetbrains-toolbox-*.tar.gz` dari situs JetBrains.
2. Ekstrak arsip:
   ```bash
   tar -xzf jetbrains-toolbox-*.tar.gz
   ```
3. Jalankan file eksekusi:
   ```bash
   ./jetbrains-toolbox
   ```
4. Dari aplikasi Toolbox, klik tombol **Install** pada **IntelliJ IDEA Ultimate**.

#### Metode C: Instalasi Manual via Tarball (.tar.gz)
1. Unduh `ideaIU-*.tar.gz` dari [Situs Resmi JetBrains](https://www.jetbrains.com/idea/download/#section=linux).
2. Ekstrak ke direktori `/opt/`:
   ```bash
   sudo tar -xzf ideaIU-*.tar.gz -C /opt/
   ```
3. Jalankan IntelliJ IDEA dari terminal:
   ```bash
   /opt/idea-IU-*/bin/idea.sh
   ```
4. (*Opsional*) Untuk membuat Desktop Shortcut:
   Buka IntelliJ IDEA -> Klik menu **Tools** di baris atas -> Klik **Create Desktop Entry...**.

---

### 3.4 Aktivasi Lisensi & Setup JDK di IntelliJ IDEA

1. **Jalankan IntelliJ IDEA**.
2. Pada pop-up **Licenses**:
   - Pilih opsi **JetBrains Account**.
   - Klik **Log In to JetBrains Account...** (Peramban web Anda akan terbuka).
   - Masukkan email dan kata sandi akun JetBrains Student yang telah terverifikasi.
   - Setelah muncul pesan *"Authorization successful"*, kembali ke IntelliJ IDEA.
   - Lisensi Educational Pack akan aktif. Klik **Activate**.

3. **Konfigurasi JDK di IntelliJ IDEA**:
   - Di halaman utama *Welcome Screen*, klik **New Project**.
   - Pada opsi **JDK**, IntelliJ akan otomatis mendeteksi JDK yang sudah terinstall di sistem (`JAVA_HOME`).
   - Jika belum ada, Anda bisa memilih opsi **"Download JDK"** langsung dari dropdown IntelliJ (Pilih Vendor: *Eclipse Temurin* atau *Oracle OpenJDK*, Versi: *21*).

---

## 4. Instalasi & Konfigurasi Visual Studio Code (VS Code)

VS Code adalah editor kode yang ringan, fleksibel, dan memiliki ekosistem ekstensi yang sangat kaya untuk pemrograman Java.

---

### 4.1 Instalasi VS Code di Windows

#### Metode A: GUI Installer
1. Kunjungi situs resmi [code.visualstudio.com](https://code.visualstudio.com/).
2. Klik tombol **Download for Windows** (User Installer `.exe`).
3. Jalankan installer dan setujui License Agreement.
4. Pada tahapan **Select Additional Tasks**, pastikan opsi berikut centang:
   - ✅ *Add "Open with Code" action to Windows Explorer file context menu*
   - ✅ *Add "Open with Code" action to Windows Explorer directory context menu*
   - ✅ *Add to PATH (requires shell restart)*
5. Klik **Install** hingga selesai.

#### Metode B: Menggunakan `winget`
Buka PowerShell dan jalankan:
```powershell
winget install Microsoft.VisualStudioCode
```

---

### 4.2 Instalasi VS Code di Linux

#### A. Ubuntu / Debian (`.deb` / Repositori Official)
```bash
# Mengunduh paket .deb terbaru
wget -O vscode.deb "https://code.visualstudio.com/sha/download?build=stable&os=linux-deb-x64"

# Menginstal paket
sudo apt install ./vscode.deb -y
```

#### B. Fedora / RHEL (`.rpm`)
```bash
sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
echo -e "[code]\nname=Visual Studio Code\nbaseurl=https://packages.microsoft.com/yumrepos/vscode\nenabled=1\ngpgcheck=1\ngpgkey=https://packages.microsoft.com/keys/microsoft.asc" | sudo tee /etc/yum.repos.d/vscode.repo
sudo dnf install code -y
```

#### C. Arch Linux / Manjaro
```bash
sudo pacman -S code
```

#### D. Snap Store
```bash
sudo snap install code --classic
```

---

### 4.3 Instalasi Ekstensi Wajib Java di VS Code

Agar VS Code menjadi IDE Java yang andal, Anda wajib menginstal **Extension Pack for Java** dari Microsoft dan beberapa ekstensi pendukung.

#### 1. Ekstensi Utama (Paket Bundel Resmi):
- **Extension Pack for Java** (`vscjava.vscode-java-pack`)
  Bundel ini secara otomatis mencakup 6 ekstensi wajib:
  1. **Language Support for Java™ by Red Hat**: Mengoperasikan IntelliSense, auto-complete, navigasi kode, dan deteksi error.
  2. **Debugger for Java**: Untuk debugging program Java (breakpoint, call stack, variables).
  3. **Test Runner for Java**: Menjalankan dan menguji unit test (JUnit/TestNG).
  4. **Maven for Java**: Mengelola dependensi proyek berbasis Apache Maven.
  5. **Project Manager for Java**: Navigasi struktur folder dan paket Java.
  6. **Visual Studio IntelliCode**: AI auto-completion cerdas.

#### 2. Ekstensi Tambahan yang Sangat Direkomendasikan:
- **Spring Boot Extension Pack** (`vmware.vscode-boot-dev-pack`): Wajib jika Anda belajar framework Spring Boot.
- **Lombok Annotations Support** (`gabrielbb.vscode-lombok`): Mendukung anotasi Lombok (`@Data`, `@Getter`, `@Setter`).
- **Gradle for Java** (`vscjava.vscode-gradle`): Pengelolaan proyek berbasis Gradle.
- **Checkstyle for Java** (`shengchen.vscode-checkstyle`): Untuk memeriksa standar format penulisan kode Java.

#### Cara Menginstal Ekstensi di VS Code:
1. Buka VS Code.
2. Tekan kombinasi tombol `Ctrl + Shift + X` (atau klik ikon empat kotak di sidebar kiri).
3. Di kolom pencarian, ketik: **`Extension Pack for Java`**.
4. Klik tombol **Install**.

*Atau menginstal via Terminal / Command Line:*
```bash
code --install-extension vscjava.vscode-java-pack
code --install-extension vmware.vscode-boot-dev-pack
code --install-extension gabrielbb.vscode-lombok
```

---

### 4.4 Konfigurasi `settings.json` di VS Code

Buka Settings (`Ctrl + ,`), klik ikon **Open Settings (JSON)** di pojok kanan atas, lalu tambahkan atau sesuaikan konfigurasi path JDK berikut:

```json
{
    "java.jdt.ls.java.home": "/usr/lib/jvm/java-21-openjdk-amd64",
    "java.configuration.runtimes": [
        {
            "name": "JavaSE-21",
            "path": "/usr/lib/jvm/java-21-openjdk-amd64",
            "default": true
        }
    ],
    "java.debug.settings.showHex": true,
    "java.inlayHints.parameterNames.enabled": "all",
    "editor.suggestSelection": "first",
    "files.autoSave": "afterDelay"
}
```
*(Catatan: Sesuaikan lokasi path di atas sesuai dengan path instalasi JDK di OS Windows/Linux Anda, misalnya `C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.2.13-hotspot` di Windows)*.

---

## 5. Pengujian Proyek Pertama (Hello World)

Mari kita uji apakah lingkungan pengembangan Java sudah berfungsi dengan sempurna.

### Menggunakan VS Code:
1. Buka folder baru di VS Code (`File` -> `Open Folder...`).
2. Buat berkas baru bernama `Main.java`.
3. Ketikkan kode Java berikut:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java World! Lingkungan pengembangan siap digunakan.");
    }
}
```

4. Klik tombol **Run** ▶️ di pojok kanan atas editor, atau tekan `F5`.
5. Hasil output akan tampil di tab **Terminal** / **Debug Console**.

---

## 6. Troubleshooting & Masalah Umum

### 1. `java` atau `javac` tidak dikenali sebagai perintah (Command Not Found)
- **Penyebab**: Variabel `JAVA_HOME` atau `Path` belum diatur dengan benar.
- **Solusi**: 
  - Pastikan variabel `JAVA_HOME` mengarah ke folder utama JDK (bukan folder `bin`).
  - Pastikan `%JAVA_HOME%\bin` (Windows) atau `$JAVA_HOME/bin` (Linux) sudah ditambahkan ke variabel `PATH`.
  - Restart Terminal/CMD atau restart komputer.

### 2. Error pada VS Code: "Java runtime could not be located"
- **Penyebab**: VS Code Java Language Server tidak menemukan JDK yang kompatibel.
- **Solusi**: Buka `settings.json` dan pastikan atribut `"java.jdt.ls.java.home"` mengarah ke direktori JDK 17 atau 21 yang valid.

### 3. Lisensi Student IntelliJ IDEA Kadaluarsa / Tidak Terdeteksi
- **Penyebab**: Masa berlaku lisensi student (1 tahun) sudah habis atau belum terhubung ke JetBrains Account.
- **Solusi**: 
  - Kunjungi portal akun JetBrains di [account.jetbrains.com](https://account.jetbrains.com/).
  - Lakukan pembaharuan (*renew*) lisensi student dengan mengunggah bukti status mahasiswa aktif kembali.
  - Di IntelliJ IDEA, klik menu **Help** -> **Register...**, lalu klik **Check License Status** atau **Log Out** dan login kembali.

---

> 💡 **Dokumentasi ini disusun berdasarkan panduan resmi:**
> - [Oracle Java Documentation](https://docs.oracle.com/en/java/)
> - [Eclipse Temurin Installation Guide](https://adoptium.net/installation/)
> - [JetBrains Educational Licensing](https://www.jetbrains.com/community/education/#students)
> - [VS Code Java Documentation](https://code.visualstudio.com/docs/java/java-tutorial)
