
val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save") // başlık
        alert.setMessage("Kaydedildi") // mesaj içerigi
        alert.setPositiveButton("saved") {p0, p1 ->
            Toast.makeText(this@MainActivity,"Saved",Toast.LENGTH_SHORT).show() //Toast Gösterme Kodu (LENGHT_SHORT Gösterme Süresidir)
        }
        alert.setIcon(R.drawable.ic_launcher_background) // Logo Resim Eklemek İçin Kod
        alert.show() //ALert Dialog Göstermek İçin kod
